class Solution {
    public int numJewelsInStones(String s1, String s2) {
        int a=0;
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            if(s1.indexOf(ch)!=-1){
                a++;

            }
        }
        return a;
    }
}