class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        // int des = target - '0';
        // int max = Integer.MAX_VALUE;
        // for(int i = 0; i< letters.length; i++){
        //     int min = letters[i] - '0' == des;
        //     max = Math.min(max, min);
        // }
        // return Arrays.toString(max);
        for(int i = 0; i < letters.length; i++){
            if(letters[i] > target){
                return letters[i];
            }
        }
        return letters[0];
    }
}