class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals,(a,b)->{
            if(a[0]<b[0])return -1;
            if(a[0]>b[0])return 1;
            return 0;
        });

        List<int[]> list = new ArrayList<>();

        int endTime = intervals[0][1];
        int startTime = intervals[0][0];

        for(int i=1;i<intervals.length;i++){
            
            if(endTime>=intervals[i][0]){
                endTime = Math.max(endTime,intervals[i][1]);
            }            
            else{
                list.add(new int[]{startTime,endTime});
                startTime = intervals[i][0];
                endTime = intervals[i][1];
            }

        }
        list.add(new int[]{startTime,endTime});


        int[][] ans = new int[list.size()][2];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }

        return ans;

    }
}