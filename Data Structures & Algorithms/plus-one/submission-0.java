class Solution {
    public int[] plusOne(int[] digits) {
        //if all 9s increase the length of array.
        for (int i=digits.length -1; i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            } else {
                digits[i]=0;
            }
        }
        if(digits[0]==0){
            int[] resultArray = new int[digits.length+1];
            resultArray[0] =1 ;
            return resultArray;
        }else {
            return digits;
        }

    }
}
