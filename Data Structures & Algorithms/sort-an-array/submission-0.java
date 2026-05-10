class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }

    private void mergeSort(int[] arr, int left, int right) {
        if (left >= right) return;
        int mid = (left + right)/2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid+1, right);

        merge(arr, left, mid, right);
    }

    private void merge(int[] arr, int left, int middle, int right) {
        int i = left, j = middle + 1, k = 0; 
        int[] temp = new int[right-left+1];

        while(i < middle + 1 && j < right + 1) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i < middle + 1) {
            temp[k++] = arr[i++];
        }

        while (j < right + 1) {
            temp[k++] = arr[j++];
        }

        for (int m = 0; m < temp.length; m++) {
            arr[left+m] = temp[m];
        }
    }
}



