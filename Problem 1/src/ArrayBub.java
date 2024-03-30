public class ArrayBub {
    private long[] a; // ref to array a
    private int nElems; // number of data items

    public ArrayBub(int max) // constructor
    {
        a = new long[max]; // create the array
        nElems = 0; // no items yet
    }

    public void insert(long value) // put element into array
    {
        a[nElems] = value; // insert it
        nElems++; // increment size
    }

    public void display() // displays array contents
    {
        for (int j = 0; j < nElems; j++) // for each element,
            System.out.print(a[j] + " "); // display it
        System.out.println("");
    }

    public void bubbleSort() { /* Count comparison */
        int out, in;
        int count = 0;
        int totalComparison = 0;
        int countSwap = 0;

        for (out = nElems - 1; out > 1; out--) {
            count = 0;
            for (in = 0; in < out; in++) {
                count++;
                if (a[in] > a[in + 1]) {
                    swap(in, in + 1);
                    countSwap++;
                }
            }
            System.out.println("Comparisons in pass " + (nElems - out) + ": " + count);
            totalComparison += count;
        }
        System.out.println("The total comparison = " + totalComparison);
        System.out.println("The number of inner loop: " + countSwap);
        double complexity = totalComparison * (totalComparison - 1) / 2.0; 
        System.out.println("The algorithms' complexity: " +complexity); 
    }

    private void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

}
