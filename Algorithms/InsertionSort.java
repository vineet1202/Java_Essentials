package Algorithms;

public class InsertionSort {

    private static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int j = i;
            while ( j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {13,46,24,52,20,9};
        insertionSort(array);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
