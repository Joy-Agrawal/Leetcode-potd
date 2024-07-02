class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> set = new HashMap<>();
        for(int a : nums1){
            set.put(a,set.getOrDefault(a,0)+1);
        }
        for(int a : nums2){
            if(set.containsKey(a)&&set.get(a)>0){
                list.add(a);
                set.put(a,set.get(a)-1);
            }
        }
        int arr[] = new int[list.size()];
        int i = 0;
        for(int a: list){
            arr[i++] = a;
        }
        return arr;
    }
}