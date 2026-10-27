class Solution {
    public String[] createGrid(int m, int n) {
       String []a=new String[m];
       Arrays.fill(a,"#".repeat(n-1)+".");
       a[0]=".".repeat(n);
       return a;
    }
}