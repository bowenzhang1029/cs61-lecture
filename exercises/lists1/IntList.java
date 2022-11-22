public class IntList {
	public int first;
	public IntList rest;

	public IntList(int f, IntList r) {
		first = f;
		rest = r;
	}

	/** Return the size of the list using... recursion! */
	public int size() {
		if (this.rest == null)
			return 0;
		else
			return 1 + this.rest.size();
	}

	/** Return the size of the list using no recursion! */
	public int iterativeSize() {
		IntList temp = this;
		int size = 0;
		while (temp != null) {
			size++;
			temp = temp.rest;
		}
		return size;
	}

	/** Returns the ith value in this list.*/
	public int get(int i) {
		if (i == 0)
			return this.first;
		else
			return this.rest.get(i - 1);
	}

	public static void main(String[] args) {
		IntList L = new IntList(15, null);
		L = new IntList(10, L);
		L = new IntList(5, L);

		System.out.println(L.size());
		System.out.println(L.iterativeSize());
		System.out.println(L.get(2));
	}
} 