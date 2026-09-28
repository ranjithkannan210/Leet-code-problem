class Solution {
    public int maxDepth(String s) {
        int a=0;
        int b=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                b++;
                a=Math.max(a,b);
            }
            else if(ch==')'){
                b--;
            }
        }return a;
        
    }
}