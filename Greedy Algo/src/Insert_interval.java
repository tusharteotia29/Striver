import java.util.ArrayList;
import java.util.List;

public class Insert_interval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res=new ArrayList<>();
        int n=intervals.length;
        int i=0;
        // left half
        while(i<n && intervals[i][1]<newInterval[0]){
            res.add(intervals[i]);
            i++;
        }
        // overlapping intervals
        while(i<n && intervals[i][0] <= newInterval[1]){
            newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
            newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
            i++;
        }

        res.add(newInterval);

        // right half
        while(i<n){
            res.add(intervals[i]);
            i++;
        }


        return res.toArray(new int[res.size()][]);

        
    }
}
