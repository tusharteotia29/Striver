import java.util.Arrays;
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
public class Job_Sequencing_problem {
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        Arrays.sort(arr, (a,b)-> b.profit-a.profit);
        int cnt=0;
        int totprofit=0;
        int maxdeadline=0;
        
        for(Job job:arr){
            if(job.deadline>maxdeadline){
                maxdeadline=job.deadline;
            }
        }
        
        boolean[] timeSlots = new boolean[maxdeadline + 1];
        
        for(Job job:arr){
            for(int j=job.deadline;j>0;j--){
                if(!timeSlots[j]){
                    cnt++;
                    totprofit+=job.profit;
                    timeSlots[j]=true;
                    break;
                }
            }
        }
        
        return new int[]{cnt,totprofit};
    }
}
