class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] graph = new ArrayList[numCourses];
        for(int i=0;i<numCourses;i++){
            graph[i]=new ArrayList<>();
        }
        int[] indegree = new int[numCourses];
        for(int i=0;i<prerequisites.length;i++){
            graph[prerequisites[i][1]].add(prerequisites[i][0]);
            indegree[prerequisites[i][0]]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0){
                queue.offer(i);
            }
        }
        
        boolean[] visited = new boolean[numCourses];

        while(!queue.isEmpty()){
            int curr = queue.poll();
            if(visited[curr])continue;
            visited[curr]=true;
            numCourses--;
            for(int i=0;i<graph[curr].size();i++){
                int child = graph[curr].get(i);
                indegree[child]--;
                if(indegree[child]==0)queue.offer(child);
            }
        }

        return numCourses==0;

    }
}