public class Candy {
    //     public int candy(int[] ratings) {
//         int n=ratings.length;
//         int left[]=new int[n];
//         int right[]=new int[n];
//         left[0]=1;
//         right[n-1]=1;

//         // left
//         for(int i=1;i<n;i++){
//             if(ratings[i]>ratings[i-1]){
//                 left[i]=left[i-1]+1;
//             }
//             else{
//                 left[i]=1;
//             }
//         }

//         // right
//         for(int i=n-2;i>=0;i--){
//             if(ratings[i]>ratings[i+1]){
//                 right[i]=right[i+1]+1;
//             }
//             else{
//                 right[i]=1;
//             }
//         }
// // take max from left and right
//         int sum=0;
//         for(int i=0;i<n;i++){
//             sum=sum+Math.max(left[i],right[i]);
//         }

//         return sum;
        
//     }


//     public int candy(int[] ratings) {
//     int n = ratings.length;
//     int[] left = new int[n];
//     left[0] = 1;

//     // Fill the left array
//     for (int i = 1; i < n; i++) {
//         if (ratings[i] > ratings[i - 1]) {
//             left[i] = left[i - 1] + 1;
//         } else {
//             left[i] = 1;
//         }
//     }

//     int curr = 1;
//     int right = 1;
//     int sum = Math.max(1, left[n - 1]);
    
//     // Calculate sum using the right values
//     for (int i = n - 2; i >= 0; i--) {
//         if (ratings[i] > ratings[i + 1]) {
//             curr = right + 1;
//             right = curr;
//         } else {
//             curr = 1;
//         }
//         sum += Math.max(left[i], curr);
//     }
//     return sum;
// }

public int candy(int[] ratings) {
    int sum=1;
    int n=ratings.length;
    int i=1;
    while(i<n){
        if(ratings[i]==ratings[i-1]){
            sum+=1;
            i++;
            continue;
        }
        int peak=1;
        while(i<n && ratings[i]>ratings[i-1]){
            peak+=1;
            sum+=peak;
            i++;
        }

        int down=1;
        while(i<n && ratings[i]<ratings[i-1]){
            sum+=down;
            i++;
            down++;
        }

        if(down>peak){
            sum+=down-peak;
        }
    }
    return sum;
 }

}
