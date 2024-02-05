/**
 * 875. Koko Eating Bananas
 * Difficulty: Medium
 * Description: Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas.
 * The guards have gone and will come back in h hours.
 *
 * Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and
 * eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will
 * not eat any more bananas during this hour.
 *
 * Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
 *
 * Return the minimum integer k such that she can eat all the bananas within h hours.
 *
 * Input: piles = [3,6,7,11], h = 8
 * Output: 4
 *
 * Input: piles = [30,11,23,4,20], h = 5
 * Output: 30
 */

public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = 1;
        for (int pile : piles) right = Math.max(right, pile);

        while (left < right) {
            int middle = left + (right - left) / 2;
            int hours = 0;

            for (int pile : piles) hours += Math.ceil((double) pile / middle);
            if (hours <= h) right = middle;
            else left = middle + 1;
        }

        return right;
    }
}