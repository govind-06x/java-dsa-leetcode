class Solution {
    public int totalFruit(int[] fruits) {
              int i = 0;
        int Max = 0;
        int basket1 = -1, basket2 = -1;
        for (int j = 0; j < fruits.length; j++) {
        
            if(basket1 == -1){
                basket1 = fruits[j];
            }
            else if(basket2 == -1 && fruits[j] != basket1){
                basket2 = fruits[j];
            }
            if(basket1 != fruits[j] && basket2 != fruits[j]){
                int lastIdx = j-1;
                while(fruits[lastIdx] == fruits[lastIdx-1]){
                    lastIdx--;
                }
                i = lastIdx;
                basket1 = fruits[lastIdx];
                basket2 = fruits[j];
            }
            Max = Math.max(Max,j-i+1);
        }
        return Max;
    }
}