class Solution {
    public boolean isAnagram(String s, String t) {
        //if they're of same length
        //convert into character arrays , sort and compare
        if(s.length() != t.length()){
            return false;
        }else {
            char[] sArray = s.toCharArray();
            char[] tArray = t.toCharArray();

            Arrays.sort(sArray);
            Arrays.sort(tArray);
            for (int i=0; i<sArray.length ;i++){
                if(sArray[i] != tArray[i]){
                    return false;
                }
            }
            return true;
        }
    }
}
