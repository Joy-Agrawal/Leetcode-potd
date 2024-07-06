class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder("");
        char arr[] = s.toCharArray();
        String vowels = "aeiouAEIOU";
        int i= 0,j = arr.length-1;
        while(i<=j){
            if(vowels.indexOf(arr[i])!=-1){
                while(j>=0 && vowels.indexOf(arr[j]) == -1){
                    j--;
                }
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
            i++;
        }
        return new String(arr);
    }
}