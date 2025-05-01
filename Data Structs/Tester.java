class ArrayTest{
    public static void insert(char arr[], int pos, char val){
        for(int i=arr.length-1; i>=pos; i--){
            arr[i] = arr[i-1];
        }
        arr[pos-1] = val;
    }
}


class Tester{
    public static void main(String[] args) {
        char arr[] = new char[6];
        arr[0] = 'A';
        arr[1] = 'B';
        arr[2] = 'C';
        arr[3] = 'D';
        arr[4] = 'E';

        ArrayTest.insert(arr, 2, 'K');

        for(char ch: arr){
            System.out.printf("%c ", ch);
        }

    }
}