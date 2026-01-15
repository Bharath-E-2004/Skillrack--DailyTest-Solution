public class PeakElement {

    public static int findPeak(int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1; // move right
            } else {
                high = mid; // move left
            }
        }
        return arr[low]; // peak element
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 6, 4, 2};
        System.out.println("Peak Element: " + findPeak(arr));
    }
}

