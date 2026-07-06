class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()== 0){
            return true;
        } else {
        String result = s.replaceAll("[^a-zA-Z0-9]", "");
        String result1 = result.toUpperCase();
        System.out.println("string is "+ result1);
        char[] c = result1.toCharArray();
        int i=0;
        int j= c.length -1;
        boolean flag = true;
        while(i<=j){
            System.out.println("i is :" + i);
            System.out.println("j is :" + j);
            System.out.println("c[j] is :" + c[j]);
            System.out.println("c[i] is :" + c[i]);
            if(c[i] != c[j]){
                return false;
            }

            i++;
            j--;
        }
        return true;
        }
        
    } 

}
