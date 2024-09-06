import java.util.Arrays;

public class InsertionSortExp {
    public static void main(String[] args) {
        int[] arr = {22, 56, 74, 9, 41, 11};
        int n = arr.length;

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println();

        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            System.out.println("Iteration: " + i);
            System.out.println(Arrays.toString(arr));
            System.out.println();
            System.out.println("key: " + key);
            System.out.println("arr[j]: " + arr[j]);

            /* Move elements that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                System.out.println(Arrays.toString(arr));
                j = j - 1;
                System.out.println("Decremented j by 1");
            }
            System.out.println("Inserting key at: (j+1) ");
            arr[j + 1] = key;

            System.out.println("After iteration " + i + ": " + Arrays.toString(arr));
            System.out.println();
        }

        //Printing the sorted array
        System.out.print("Sorted Array: ");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
