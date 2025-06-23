package Algorithms;

public class BubbleSort {

    private static void bubbleSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {13,96,24,52,20,9};
        bubbleSort(array);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
