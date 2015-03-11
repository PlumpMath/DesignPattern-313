package lili.btree;

/**
 * Created by lili on 2015/3/11.
 */
public final class Node {
	/**
	 * Node Values (Leaf Values / Key Values for the children nodes).
	 */
	int[] values;

	/**
	 * Node Array, pointing to the children nodes.
	 * This array is not initialized for leaf nodes.
	 */
	int[] children;

	/**
	 * Number of entries
	 * (Rule in B+ Trees:  d <= size <= 2 * d).
	 */
	int size;
}
