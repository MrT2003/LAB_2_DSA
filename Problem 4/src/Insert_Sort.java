public class Insert_Sort {
    private int[] a;
    private int nElems;

    public Insert_Sort(int max) {
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

    public void insertSort() {
        int comparison = 0;
        int countCopies = 0;
        int countSwap = 0;
        int i, j, temp;
        for (i = 1; i < a.length; i++) {
            temp = a[i];
            countCopies++;
            j = i - 1;
            comparison++;
            while (j >= 0 && a[j] > temp) {
                a[j + 1] = a[j];
                countCopies++;
                j--;
                comparison++;
            }
            a[j + 1] = temp;
            countCopies++;
            countSwap++;
        }
        System.out.println("Count Comparison: " +comparison);
        System.out.println("Count Swap: " +countSwap);
        System.out.println("Count Copies: " +countCopies);
    }
}
