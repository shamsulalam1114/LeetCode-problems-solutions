class Solution {
 public:
  int maxArea(vector<int>& heights) {
    int left = 0, right = (int)heights.size() - 1, cur_max = 0, cur_area;
    while (left < right) {
      // Update max seen so far
      cur_area = min(heights[left], heights[right]) * (right - left);
      cur_max = max(cur_max, cur_area);
      // Always keep the longer one and move the shorter.
      if (heights[left] < heights[right]) {
        ++left;
      } else {
        --right;
      }
    }
    return cur_max;
  }
};
