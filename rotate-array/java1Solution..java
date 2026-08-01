class Solution {

    public void swap(int[] arr, int low, int high) {
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public int[] rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        swap(arr, 0, n - 1);
        swap(arr, 0, k - 1);
        swap(arr, k, n - 1);

        return arr;
    }
}