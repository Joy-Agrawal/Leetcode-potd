class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String words[] = sentence.split(" ");
        StringBuilder sb = new StringBuilder("");
        Collections.sort(dictionary);
        for(String str: words){
            int flag = 0;
            for(String st : dictionary){
                if(str.startsWith(st)){
                    sb.append(st+" ");
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                sb.append(str+" ");
            }
        }
        return sb.deleteCharAt(sb.length()-1).toString();
    }
}