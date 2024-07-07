class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count = numBottles;
        while(numBottles!=0){
            int n = numBottles/numExchange;
            int left = 0;
            if(n>0)
            left = numBottles%numExchange;
            count+=n;
            numBottles = n+left;
        }
        return count;
    }
}