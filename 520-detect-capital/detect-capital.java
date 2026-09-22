class Solution {
    public boolean detectCapitalUse(String a) {
        int u=0;
        int v=0;
        for(int i=0;i< a.length();i++){
            char c = a.charAt(i);
            if(Character.isUpperCase(c)){
                u++;}
            }
            if(u==a.length()){
                return true;
            }
            if(u==0){
                return true;
            }
            char temp=a.charAt(0);
            if(Character.isUpperCase(temp)){
                v++;
            }
            if(v==1 && u==1){
                return true;
            }
        
        return false;
        
    }
}