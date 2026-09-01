class Solution {
    public boolean isPalindrome(String s) {
        char[] strArray = s.toLowerCase()
            .replaceAll("[^a-z0-9]", "")
            .toCharArray();
        int left=0,right=strArray.length-1;

        while(left < right){
            if( Character.isDigit(strArray[left]) &&
            Character.isDigit(strArray[right]) ||
            Character.isLetter(strArray[left]) &&
            Character.isLetter(strArray[right]) )
            {
                if(strArray[left] != strArray[right])
                    return false;
            }

            else 
                return false;

            left++;
            right--;
        }

        return true;
    }
}
