class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int i = 0, j = n - 1;
        int maxLeft = 0, maxRight = 0;
        int count = 0;
        
        while (i <= j) {
            if (height[i] <= height[j]) {
                if (height[i] >= maxLeft) {
                    maxLeft = height[i];
                } else {
                    count += maxLeft - height[i];
                }
                i++;
            } else {
                if (height[j] >= maxRight) {
                    maxRight = height[j];
                } else {
                    count += maxRight - height[j];
                }
                j--;
            }
        }
        
        return count;
    }
}
