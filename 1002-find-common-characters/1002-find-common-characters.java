class Solution {
    public List<String> commonChars(String[] words) {
        List<String> list = new ArrayList<>();
        int freq[] = new int[26];
        for(int i = 0;i<words[0].length();i++){
            char curr = words[0].charAt(i);
            freq[curr-'a']++;
        }
        for(String temp : words){
            int n = temp.length();
            int fr[] = new int[26];
            for(int i = 0;i<n;i++){
                char curr = temp.charAt(i);
                fr[curr-'a']++;
            }
            for(int i = 0;i<26;i++){
                freq[i] = Math.min(freq[i],fr[i]);
            }
        }
        for(int i = 0;i<26;i++){
            if(freq[i]>0){
                for(int j = 0;j<freq[i];j++){
                    list.add((char)('a'+i)+"");
                }
            }
        }
        return list;
    }
}