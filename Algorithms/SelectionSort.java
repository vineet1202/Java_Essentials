package Algorithms;

public class SelectionSort{

    private static void selectionSort(int[] arr){

        //select the min
        for(int i=0; i<arr.length-1; i++){
            int minIdx = i;
            for(int j=i; j<arr.length; j++){
                if ( arr[j] <  arr[minIdx] ){
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {13,46,24,52,20,9};
        selectionSort(array);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}