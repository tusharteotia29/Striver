public class Missing_number_in_array{

    // Brute Approach

    // public int missingNumber(int[] nums) {
    //     int n=nums.length;
    //     for (int i = 0; i <= n; i++) {
    //         boolean flag=false;
    //         for (int j = 0; j < n; j++) {
    //             if (nums[j]==i) {
    //                 flag=true;
    //                 break;   
    //             }  
    //         }
    //         if (flag==false) {
    //             return i;   
    //         }
    //     }
    //     return -1;
    // }

    // Better Approach
        // hashing

    // public int missingNumber(int[] nums) {

    //     int n=nums.length;
    //     int hash[]=new int[n+1];
    //     for(int i=0;i<n;i++){
    //         hash[nums[i]]=1;
    //     }
    //     for(int j=0;j<=n;j++){
    //         if(hash[j]==0){
    //             return j;
    //         }
    //     }
    //      return -1;
    // }

    // Optimal Approach
        // sum
   
        // public int missingNumber(int[] nums){
        //     int n=nums.length;
        //     int sum=(n*(n+1))/2;
        
        //     int s2=0;
        
        //     for(int i=0;i<n;i++){
        //         s2=s2+nums[i];
        //     }
        
        //     return sum-s2;
        
        //    }

        // XOR
        public int missingNumber(int[] nums){

            int xor1=0;
            int xor2=0;
            for (int i = 0; i < nums.length; i++) {
                xor2=xor2^nums[i];
                xor1=xor1^(i);
            }
            xor1=xor1^nums.length;
            return xor1^xor2;
        }


    public static void main(String[] args) {
    
    }

}


