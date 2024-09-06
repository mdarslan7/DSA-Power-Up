public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {22, 56, 74, 9, 41, 11};
        int n = arr.length;

        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;

        }

        //Printing the sorted array
        System.out.print("Sorted Array: ");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}