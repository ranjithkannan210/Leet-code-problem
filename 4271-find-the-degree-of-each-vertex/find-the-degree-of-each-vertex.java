class Solution {
    public int[] findDegrees(int[][] a) {
         int [] b=new int [a.length];
        for(int i=0;i<a.length;i++){
           
            int sum=0;
            for(int j=0;j<a[i].length;j++){
                sum+=a[i][j];
            }
             b[i]=sum;
             }
            
        
       
        return b;

        
    }
}