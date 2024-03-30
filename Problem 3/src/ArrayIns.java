public class ArrayIns {
    private long[] a; // ref to array a
    private int nElems; // number of data items
    // --------------------------------------------------------------

    public ArrayIns(int max) // constructor
    {
        a = new long[max]; // create the array
        nElems = 0; // no items yet
    }

    // --------------------------------------------------------------
    public void insert(long value) // put element into array
    {
        a[nElems] = value; // insert it
        nElems++; // increment size
    }

    // --------------------------------------------------------------
    public void display() // displays array contents
    {
        for (int j = 0; j < nElems; j++) // for each element,
            System.out.print(a[j] + " "); // display it
        System.out.println("");
    }

    // --------------------------------------------------------------
    public void insertionSort() {
        int in, out;
        int totalPasses = 0;
        int innerPasses = 0;

        for (out = 1; out < nElems; out++) {
            long temp = a[out]; 
            in = out; 
            int passes = 0;
            while (in > 0 && a[in - 1] >= temp) {
                a[in] = a[in - 1]; 
                --in; // 
                passes++;
            }
            innerPasses += passes;
            a[in] = temp; // insert marked item
            totalPasses += passes + 1;
        }
        System.out.println("The number of passes of inner loop: " +innerPasses);
        System.out.println("Total number of passes: " + totalPasses);
        double complexity = totalPasses * (totalPasses - 1) / 4.0; 
        System.out.println("The algorithms' complexity: " +complexity); 
    }
}
