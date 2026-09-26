class Solution {
    public int countNegatives(int[][] a) {
        int s=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j] < 0){
                    s++;

                }
            }
        }
        return s;
        
    }
}