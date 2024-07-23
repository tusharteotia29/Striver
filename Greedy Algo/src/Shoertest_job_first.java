import java.util.Arrays;

public class Shoertest_job_first {
    static int solve(int bt[] ) {
    // code here
    Arrays.sort(bt);
    int n=bt.length;
    int time=0;
    int wait_time=0;
    for(int i=0;i<n;i++){
        wait_time+=time;
        time+=bt[i];
    }
    return wait_time/n;

  }
}
