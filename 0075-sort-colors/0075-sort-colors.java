class Solution {
    public void sortColors(int[] arr) {
        // in this ques we will apply dutch national flag alogorithm
        // in this we will take three pointers 
        // the first one is low , the elements before low will be 0
        // the second one is mid, the elements between low to mid-1 will be 1
        // the third one is high , the elements between high+1 to n-1 will be 2
        // The left portion of the array , i.e form mid to high is the unsorted region
        // of the array 
        int n = arr.length;
        int low = 0,mid = 0, high = n-1;
        // we have place the mid and low both at 0 , since initally the array is unsorted
        while(mid<=high){
            if(arr[mid] == 0){
                // swap the low and the mid 
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;mid++;
            }
            else if (arr[mid] == 2){
                // swap the high and the mid
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;

                high--;
            }
            else{
                mid++;
            }

            
        }
    }
}