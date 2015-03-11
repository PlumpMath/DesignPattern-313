package lili.btree;

/**
 * Created by lili on 2015/3/11.
 */
public class TestBTree {
	/** Random instance with initial seed to guarantee constant random numbers. */
	private static final java.util.Random RANDOM = new java.util.Random(1);
	/** Timer, used for performance measuring. */
	private static long time;

	/**
	 * Main method, user for testing.
	 * @param args command line arguments (ignored)
	 */
	public static void main(String[] args) {
		out("*** B+Tree Testing ***\n\n");

		/** Test simple string array. */
		test(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });

		/** Test random string array. */
		test(randomValues(100));
		//test(randomValues(10000));
		//test(randomValues(1000000));

		out("*** Finished Testing ***\n");
	}

	/**
	 * Create and test a B+ Tree with the specified values.
	 * @param values values to be inserted and tested
	 */
	public static void test(int[] values) {
		// number of strings to be inserted
		int nrValues = values.length;

		// initialize timer
		time = System.nanoTime();

		out("Create B+ Tree with " + nrValues + " Values...\n");
		BTree tree = new BTree();
		mem();

		out("Insert Values...\n");
		for(int v : values) tree.insert(v);
		int size = tree.nrValues();
		out("Stored Nodes: " + size + "\n");
		mem();

		out("Finding Values...\n");
		int found = 0;
		for(int v : values) if(tree.contains(v)) found++;
		out(found + " found, " + nrValues + " expected.\n");
		mem();

		out("Reinsert Values... \n");
		for(int v : values) tree.insert(v);
		out(tree.nrValues() + " stored, " + size + " expected.\n");
		mem();

		out("Finding Values...\n");
		found = 0;
		for(int v : values) if(tree.contains(v)) found++;
		out(found + " found, " + nrValues + " expected.\n");
		mem();

		out("\n");
	}

	/**
	 * Creates an array with random strings.
	 * @param n number of random strings
	 * @return random string
	 */
	private static int[] randomValues(int n) {
		int[] strings = new int[n];
		for(int i = 0; i < n; i++) strings[i] = RANDOM.nextInt() & 65535;
		return strings;
	}

	/**
	 * Displays some timing and approximate memory info.
	 */
	public static void mem() {
		// display timing information
		out("- Time: " + (System.nanoTime() - time) / 1000000 + " ms");

		// initialize memory and calculate memory consumption
		for(int i = 0; i < 3; i++) System.gc();
		Runtime r = Runtime.getRuntime();
		long a = r.totalMemory() - r.freeMemory();
		boolean b = a > 1 << 20;
		long f = b ? 20 : 10;
		out(" (" + (a + (1 << f - 1) >> f) + (b ? " mb" : " kb") + ")\n\n");

		// set new timer
		time = System.nanoTime();
	}

	/**
	 * Prints the specified text to {@link System#out}.
	 * @param text text to be printed
	 */
	private static void out(String text) {
		System.out.print(text);
	}

}
