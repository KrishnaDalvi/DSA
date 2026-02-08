class Solution {
    public int strStr(String haystack, String needle) {
        char[] ch1 = haystack.toCharArray();
        char[] ch2 = needle.toCharArray();
        int j  = 0 ;
        int index = 0 ;
        if(ch2.length > ch1.length){
                return -1 ;
            }

        for(int i = 0 ; i <= haystack.length() - needle.length() ; i++){
            
            if(haystack.substring(i,i+needle.length()).equals(needle)){

                return i ;
            }
            
            
        }
        return -1 ;
        

    }
}