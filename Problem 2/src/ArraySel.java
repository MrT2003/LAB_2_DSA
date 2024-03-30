public class ArraySel {
    private long[] a; // ref to array a
    private int nElems; // number of data items
    // --------------------------------------------------------------

    public ArraySel(int max) // constructor
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
    public void selectionSort() {
        int i, j, min;
        int comparison = 0;
        int totalComparison = 0;
        int nums = 0;

        for (i = 0; i < nElems - 1; i++) // outer loop
        {
            min = i; // minimum
            comparison = 0;
            nums++;
            for (j = i + 1; j < nElems; j++) {
                nums++;
                if (a[min] > a[j]) {
                    comparison++;
                    min = j; // we have a new min
                } // if min greater,
            } // inner loop
            totalComparison += comparison;
            if(min != i) {
                System.out.println("Swapping " + a[i] + " and " + a[min]);
                swap(i, min); // swap them
            }
        } // end for(out)
        System.out.println("The number of comparisons after inner loop: "+totalComparison);
        System.out.println("The total number of comparisons: " +nums);
        double complexity = totalComparison * (totalComparison - 1) / 2.0; 
        System.out.println("The algorithms' complexity: "+complexity); 
    } // end selectionSort()
      // --------------------------------------------------------------

    private void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
    // --------------------------------------------------------------
} // end class ArraySel
