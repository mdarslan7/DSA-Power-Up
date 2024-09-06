public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {9, 6, 2, 11, 3, 1, 10, 69, 7, 15, 31, 911};
        int n = arr.length;

        for(int i=0; i<n; i++) {
            int minIndex = i;
            for(int j=i+1; j<n; j++) {
                if(arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }

            //swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        //printing the array
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}