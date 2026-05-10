class Solution {
    public void swap(int[] arr, int l, int h){
        int temp = arr[l];
        arr[l] = arr[h];
        arr[h] = temp;
    }
    public int getPivot(int[] arr, int l, int h){
        int i= l, j = h, pivot = arr[l];
        while(i<j){
            while(arr[i]<=pivot && i<=h-1){
                i++;
            }
            while(arr[j]>pivot && j>=l+1){
                j--;
            }
            if(i<j){
                swap(arr, i, j);
            }
        }
        swap(arr, l, j);
        return j;
    }
    public void quicksort(int[] arr , int l, int h){
        if(l<h){
            int pivot = getPivot(arr, l, h);
            quicksort(arr, l, pivot-1);
            quicksort(arr, pivot+1, h);
        }
    }
    public int[] sortArray(int[] nums) {
        quicksort(nums, 0, nums.length-1);
        return nums;
    }
}