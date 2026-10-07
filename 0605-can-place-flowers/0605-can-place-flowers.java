class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }
        int count = n;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                if (i == 0) {
                    if (flowerbed.length == 1) {
                        flowerbed[i] = 1;
                        count--;
                    } else if (flowerbed[i + 1] == 0) {
                        flowerbed[i] = 1;
                        count--;
                    }
                } else if (i == flowerbed.length - 1 && flowerbed[i - 1] == 0) {
                    flowerbed[i] = 1;
                    count--;
                } else if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    count--;
                }
                if (count == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}