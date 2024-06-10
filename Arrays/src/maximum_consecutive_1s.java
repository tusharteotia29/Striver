public class maximum_consecutive_1s {

    public int findMaxConsecutiveOnes(int[] nums) {

        int cnt=0;
        int maxi=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==1) {
                cnt++;
                maxi=Math.max(maxi, cnt);
            } else {
                cnt=0;   
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        
    }
    
}
