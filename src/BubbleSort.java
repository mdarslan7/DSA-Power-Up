public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {22, 56, 74, 9, 41, 11};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        //Printing the sorted array
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}