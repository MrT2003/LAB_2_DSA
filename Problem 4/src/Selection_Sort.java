public class Selection_Sort {
    private int[] a;
    private int nElems;

    public Selection_Sort(int max) {
        a = new int[max];
        nElems = 0;
    }

    public void insert(int value) {
        a[nElems] = value;
        nElems++;
    }

    public void display() {
        for (int j = 0; j < nElems; j++)
            System.out.print(a[j] + " ");
        System.out.println("");
    }

    public void selectionSort() {
        int comparison = 0;
        int countCopies = 0;
        int countSwap = 0;
        for (int i = 0; i < a.length; i++) {
            int min = i;
            countCopies++;
            for (int j = i + 1; j < a.length; j++) {
                comparison++;
                if (a[min] > a[j]) {
                    min = j;
                    countCopies++;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
            countSwap ++;
        }
        System.out.println("Count Comparison: " +comparison);
        System.out.println("Count Swap: " +countSwap);
        System.out.println("Count Copies: " +countCopies);
    }
}
