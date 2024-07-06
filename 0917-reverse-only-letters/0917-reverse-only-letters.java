class Solution {
    public String reverseOnlyLetters(String s) {
        char arr[] = s.toCharArray();
        int i = 0,j= arr.length-1;
        while(i<=j){
            if((arr[i]>=65 && arr[i]<=90)  || (arr[i]>=97 && arr[i]<=122)){
                while(arr[j]<65 || (arr[j]>90 && arr[j]<97)){
                    j--;
                }
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;j--;
            }
            else
                i++;
            
        }
        return new String(arr);
    }
}