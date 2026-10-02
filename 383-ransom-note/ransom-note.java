class Solution {
    public boolean canConstruct(String r, String magazine) {
        int []freq=new int[26];
        for(int i=0;i<magazine.length();i++){
            freq[magazine.charAt(i)-'a']++;

        }
        for(int i=0;i<r.length();i++){
            int index=r.charAt(i)-'a';
            if(freq[index]==0){
                return false;           }
        
        freq[index]--;
    }
    
    return true;
}}