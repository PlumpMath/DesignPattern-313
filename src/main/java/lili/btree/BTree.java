package lili.btree;

/**
 * B+ Tree skeleton
 * Created by lili on 2015/3/11.
 */
public class BTree {
	/** Fixed Node Size. */
	private static final int NODESIZE = 4;
	/** Node array, initialized with length = 1. */
	private Node[] nodes = new Node[1];
	/** Number of currently stored nodes. */
	private int nrNodes;
	/** Pointer to the root node. */
	private int root;
	/** Counter of currently stored values. */
	private int nrValues;

	/**
	 * B+ Tree Constructor.
	 */
	public BTree() {
		root = createNode();
		nodes[root].children[0] = createLeaf();
	}

  /* ======================== Public Methods ======================== */

	/**
	 * Returns true if the specified value was found.
	 * @param value value to be searched for
	 * @return true if value was found
	 */
	public boolean contains(int value) {
		return nodeContains(value, root);
	}

	/**
	 * Inserts a value into the tree structure.
	 * If -1 is returned, everything went alright.
	 * If -2 if the node has already been stored.
	 * @param value value to be added
	 */
	public void insert(int value) {
		if(nodeInsert(value, root) == -1) nrValues++;
	}

	/**
	 * Deletes a value from the tree structure.
	 * If -1 is returned, everything went alright.
	 * If -2 is returned, the value did not exist.
	 * @param value value to be removed
	 */
	public void delete(int value) {
		if(nodeDelete(value, root) == -1) nrValues--;
	}

	/**
	 * Returns the number of currently stored values.
	 * @return number of stored values
	 */
	public int nrValues() {
		return nrValues;
	}

  /* ======================== Private Methods ======================= */

	/**
	 * Returns true if the specified value was found in the specified node.
	 * @param value value to be found
	 * @param pointer pointer to the current node
	 * @return true if value has been found
	 */
	private boolean nodeContains(int value, int pointer) {
		// TO BE IMPLEMENTED...
		return false;
	}

	/**
	 * Inserts a value into the tree structure.
	 * @param value value to be inserted
	 * @param pointer pointer to the current node
	 * @return
	 *  -2 if the node has already been stored,
	 *  -1 if everything has been done or
	 *   something else if the parent node has to be restructured
	 */
	private int nodeInsert(int value, int pointer) {
		// TO BE IMPLEMENTED...
		return 0;
	}

	/**
	 * Deletes a value from the tree structure.
	 * @param value value to be inserted
	 * @param pointer pointer to the current node
	 * @return
	 *   -2 if the node has not been found,
	 *   -1 if everything has been done or
	 *   something else if the parent node has to be restructured
	 */
	private int nodeDelete(int value, int pointer) {
		// TO BE IMPLEMENTED...
		return 0;
	}

  /* ========================== Node Access ========================= */

	/**
	 * Returns true if the specified node is a leaf node.
	 * The leaf status is defined by a missing children instantiation.
	 * @param node node reference
	 * @return true for a leaf node
	 */
	boolean isLeaf(Node node) {
		return node.children == null;
	}

	/**
	 * Creates a new node and returns the pointer.
	 * @return node pointer
	 */
	int createNode() {
		Node node = new Node();
		node.values = new int[NODESIZE];
		node.children =  new int[NODESIZE + 1];

		checkSize();
		nodes[nrNodes] = node;
		return nrNodes++;
	}

	/**
	 * Creates a new leaf node and returns the pointer.
	 * @return node pointer
	 */
	int createLeaf() {
		Node node = new Node();
		node.values = new int[NODESIZE];

		checkSize();
		nodes[nrNodes] = node;
		return nrNodes++;
	}

	/**
	 * Resizes the node array if necessary.
	 */
	private void checkSize() {
		if(nrNodes == nodes.length) {
			Node[] tmp = new Node[nrNodes << 1];
			System.arraycopy(nodes, 0, tmp, 0, nrNodes);
			nodes = tmp;
		}
	}
}
