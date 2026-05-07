class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // index 0 dont loof left
        // index length-1 dont look right;
        for(int i =0; i < flowerbed.length ;i++){
           boolean left = i == 0 || flowerbed[i - 1] == 0;
            boolean right = i == flowerbed.length - 1 || flowerbed[i + 1] == 0;
           if(left && right && flowerbed[i]  == 0) {
                flowerbed[i] =1;
                 n--;  
           } 
        } //end of for 
    return n<=0;
    }
}