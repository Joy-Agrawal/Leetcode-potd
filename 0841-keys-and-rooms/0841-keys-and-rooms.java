class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        dfs(rooms,visited,0);
        for(int i = 0;i<visited.length;i++){
            if(!visited[i]){
                return false;
            }
        }
        return true;
    }

    private void dfs(List<List<Integer>> rooms,boolean[] vis,int node){
        vis[node] = true;
        for(int n : rooms.get(node)){
            if(!vis[n]){
                dfs(rooms,vis,n);
            }
        }
    }
}