class Solution {
    public String reverseVowels(String s) {
        char[] chArr = s.toCharArray();
        int i = 0;
        int j = chArr.length-1;
       
        while(i<j){
            while(i<j && !isVowel(chArr[i])){
                i++;
            }
            while(i < j && !isVowel(chArr[j])){
                j--;
            }
            swap(chArr, i, j);
            i++;
            j--;
            
        }
        return new String(chArr);
    }
    static boolean isVowel(char ch){
        return ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U' ;
    }
    static void swap(char[] chArr, int i, int j){
       char temp = chArr[i];
       chArr[i] = chArr[j];
       chArr[j] = temp;

    }
}