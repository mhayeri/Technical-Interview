
/**
 * 605. Can Place Flowers
 * Difficulty: Easy
 * Description: You have a long flowerbed in which some of the plots are planted, and some are not. However,
 * flowers cannot be planted in adjacent plots.
 *
 * Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and
 * an integer n, return true if n new flowers can be planted in the flowerbed without violating the
 * no-adjacent-flowers rule and false otherwise.
 *
 * Input: flowerbed = [1,0,0,0,1], n = 1
 * Output: true
 *
 * Input: flowerbed = [1,0,0,0,1], n = 2
 * Output: false
 */
public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int validPlants = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                boolean isLeftPlotOpen = (i == 0) || flowerbed[i-1] == 0;
                boolean isRightPlotOpen = (i == flowerbed.length - 1) || flowerbed[i+1] == 0;

                if (isLeftPlotOpen && isRightPlotOpen) {
                    flowerbed[i] = 1;
                    validPlants++;
                    if (validPlants >= n) return true;
                }
            }
        }
        return validPlants >= n;
    }
}
