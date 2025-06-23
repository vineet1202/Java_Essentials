package Algorithms;

public class QuickSort {

    private static void quickSort(int[] arr, int low , int high){
        if( low < high){
            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex-1);
            quickSort(arr, partitionIndex+1, high);
        }
    }

    private static int partition(int arr[], int low, int high){
        //select pivot
        int pivot = low;
        int i = low;
        int j = high;

        while( i< j){
            //find the first element greater than the pivot from the left
            while( arr[i] <= arr[pivot] && i<=high-1){
                i++;
            }
            //find the first element smaller than the pivot from the right
            while( arr[j] > arr[pivot] && j>=low+1){
                j--;
            }
            if( i < j ){
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swap(arr[low], arr[j])
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

    public static void main(String[] args) {
        int[] array = {13,46,24,52,20,9};
        quickSort(array, 0, array.length-1);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
