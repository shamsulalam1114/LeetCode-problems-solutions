#include <vector>
#include <algorithm>

class Solution {
public:
    std::vector<int> addToArrayForm(std::vector<int>& num, int k) {
        std::vector<int> integerList;
        int carry = 0;
        int i = num.size() - 1;

        while (i >= 0 || k > 0) {
            int result = (i >= 0 ? num[i--] : 0) + k % 10 + carry;
            integerList.push_back(result % 10);
            carry = result / 10;
            k = k / 10;
        }

        if (carry != 0) {
            integerList.push_back(carry);
        }

        std::reverse(integerList.begin(), integerList.end());
        return integerList;
    }
};
