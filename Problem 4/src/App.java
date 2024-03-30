import java.util.Random;

public class App {
    public static void main(String[] args) {
        int maxSize = 50000;
        Bubble_Sort bbs = new Bubble_Sort(maxSize);
        Selection_Sort sls = new Selection_Sort(maxSize);
        Insert_Sort iss = new Insert_Sort(maxSize);
        Random random = new Random();

        for(int i = 0; i < maxSize; i++) {
            bbs.insert(random.nextInt(10001));
            sls.insert(random.nextInt(10001));
            iss.insert(random.nextInt(10001));
        }
        System.out.println("The outcome of Bubble Sort: ");
        bbs.bubbleSort();
        System.out.println();
        System.out.println("The outcome of Selection Sort: ");
        sls.selectionSort();
        System.out.println();
        System.out.println("The outcome of Insert Sort: ");
        iss.insertSort();
        System.out.println();
    }
}
