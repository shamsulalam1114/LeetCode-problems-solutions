#include <stack>
#include <vector>
#include <climits>

class Solution {
public:
    bool find132pattern(std::vector<int>& nums) {
        std::stack<int> stack;
        int second = INT_MIN;

        for (int i = nums.size() - 1; i >= 0; i--) {
            if (nums[i] < second) {
                return true;
            }
            while (!stack.empty() && nums[i] > stack.top()) {
                second = stack.top();
                stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;
    }
};
