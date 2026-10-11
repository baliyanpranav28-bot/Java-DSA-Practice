class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int first = 1; 
        int last = arr.length-1;
        while(first <= last){
            int mid = (first + last)/2;
            if(arr[mid-1] < mid && mid > arr[mid+1]){
            return mid;
        }else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
            first = mid+1;
        }else{
            last = mid-1;
        }
       
    }
     return first;
}
}