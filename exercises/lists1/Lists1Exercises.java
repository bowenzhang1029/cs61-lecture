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

    /** Returns an IntList identical to L, but with
     * each element incremented by x. L is not allowed
     * to change. */
   public static IntList incrList(IntList L, int x) {
       L = new IntList(L.first + x, L.rest);
       IntList J = L;
       while (J.rest != null) {
    	   J.rest = new IntList(J.rest.first + x, J.rest.rest);
    	   J = J.rest;    	   
       }
       return L;        
   }

   /** Returns an IntList identical to L, but with
     * each element incremented by x. Not allowed to use
     * the 'new' keyword. */
   public static IntList dincrList(IntList L, int x) {
       IntList J = L;
       while (J != null) {
    	   J.first += x;
    	   J = J.rest;
       }
       return L;
   }

   public static void main(String[] args) {
       IntList L = new IntList(5, null);
       L.rest = new IntList(7, null);
       L.rest.rest = new IntList(9, null);

       System.out.println(L.size());
       System.out.println(L.iterativeSize());

       // Test your answers by uncommenting. Or copy and paste the
       // code for incrList and dincrList into IntList.java and
       // run it in the visualizer.

       System.out.println(incrList(L, 3).get(2));
       System.out.println(L.get(2));
       System.out.println(dincrList(L, 3).get(2));
       System.out.println(L.get(2));
   }
} 