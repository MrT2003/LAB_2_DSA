public class Bubble_Sort {
    private int[] a;
    private int nElems;

    public Bubble_Sort(int max) {
        a = new int[max];
        nElems = 0;
    }

    public void insert(int value) {
        a[nElems] = value;
        nElems++;
    }

    public void display() {
        for (int j = 0; j < nElems; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println("");
    }

    public void bubbleSort() {
        int comparison = 0;
        int countSwap = 0;
        int countCopies = 0;

        for(int i = 0; i < a.length - 1; i++) {
            for(int j = 0; j < a.length - i - 1; j++) {
                comparison++;
                if(a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    countCopies+= 3;
                    countSwap++;
                }
            }
        }
        System.out.println("Count Comparison: " +comparison);
        System.out.println("Count Swap: " +countSwap);
        System.out.println("Count Copies: " +countCopies);
    }
}
