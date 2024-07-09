class Solution {
    public double averageWaitingTime(int[][] customers) {
        int n = customers.length;
        double wait = 0;
        int curr = customers[0][0];
        for(int i = 0;i<n;i++){
            curr = curr+customers[i][1];
            if(customers[i][0]>curr){
                curr = customers[i][0] + customers[i][1];
            }
            wait = wait +curr-customers[i][0];
        }
        return wait/n; 
    }
}