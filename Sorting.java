import java.util.Scanner;
public class Task1 {
    static void BubblesortAscending(int[] elements, int size){

        System.out.println("Bubble Sort");

        int noOfCompare=0; int noOfSwap=0;

        for(int i=0;i<size;i++){
            for(int j=0;j<size-i-1;j++){
                noOfCompare++;
                if(elements[j]>elements[j+1]){
                    int temp=elements[j];
                    elements[j]=elements[j+1];
                    elements[j+1]=temp;
                    noOfSwap++;
                }
            }
        }

        System.out.print("Sorted Elements : ");
        for(int i=0;i<size;i++){
            System.out.print(elements[i]+" ");
        }

        System.out.println();
        System.out.println("Number of comparisons : "+noOfCompare);
        System.out.println("Number of swaps : "+noOfSwap);
        System.out.println("------------------------------------------------");

    }
    static void SelectionAscending(int[] elements, int size){
        System.out.println("Selection Sort");
        int noOfCompare=0; int noOfSwap=0;
        for(int j=0;j<size-1;j++) {
            int temp = j;
            for (int i = j+1; i<size; i++) {
                if (elements[i] < elements[temp]) {
                    noOfSwap++;
                    temp = i;
                }
                noOfCompare++;
            }
            int min=elements[temp];
            elements[temp]=elements[j];
            elements[j]=min;
        }

        System.out.print("Sorted Elements : ");
        for(int i=0;i<size;i++){
            System.out.print(elements[i]+" ");
        }
        System.out.println();
        System.out.println("No of Comparisons : "+noOfCompare);
        System.out.println("No of Exchange : "+noOfSwap);
        System.out.println("------------------------------------------------");
    }
    static void InsertionSortAscending(int[] elements,int size) {
        System.out.println("Insertion Sort");
        int noOfCompare =0, noOfSwap =0;

        for (int i = 0; i < size-1; i++) {
            int temp = elements[i];
            int j = i - 1;
            noOfCompare++;
            while (j>=0 && elements[j] > temp) {
                elements[j+1] = elements[j];
                j--;
                noOfSwap++;
            }
            elements[j+1] = temp;
        }
        System.out.print("Sorted Elements : ");
        for(int i=0;i<size;i++){
            System.out.print(elements[i]+" ");
        }

        System.out.println();
        System.out.println("No of Comparisons : "+noOfCompare);
        System.out.println("No of Exchange : "+noOfSwap);
        System.out.println("------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number of Unsorted elements : ");
        int size = input.nextInt();
        int[] elementsB = new int[size];
        int[] elementsS = new int[size];
        int[] elementsI = new int[size];

        System.out.println("Enter the elements : ");
        for(int i=0;i<size;i++){
            elementsB[i]=input.nextInt();
            elementsS[i]=elementsB[i];
            elementsI[i]=elementsB[i];
        }
        System.out.print("Unsorted : ");
        for(int i=0;i<size;i++){
            System.out.print(elementsB[i]+" ");
        }
        System.out.println();
        System.out.println("------------------------------------------------");

        long startBubble = System.nanoTime();
        BubblesortAscending(elementsB,size);
        long endBubble = System.nanoTime();
        long timeBubble = endBubble-startBubble;

        long startSelection = System.nanoTime();
        SelectionAscending(elementsS,size);
        long endSelection = System.nanoTime();
        long timeSelection = endSelection-startSelection;

        long startInsertion = System.nanoTime();
        InsertionSortAscending(elementsI,size);
        long endInsertion = System.nanoTime();
        long timeInsertion = endInsertion-startInsertion;

        System.out.println("Time taken for Bubble Sort : "+timeBubble+" ns");
        System.out.println("Time taken for Selection Sort : "+timeSelection+" ns");
        System.out.println("Time taken for Insertion Sort : "+timeInsertion+" ns");
    }
}
