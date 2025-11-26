#include <vector>
#include <unordered_set>
using namespace std;

class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        // Use a hash set to store elements we have seen
        unordered_set<int> seen;
        
        for (int num : nums) {
            // If num is already in the set, we found a duplicate
            if (seen.count(num)) {
                return true;
            }
            // Otherwise, add it to the set
            seen.insert(num);
        }
        
        return false;
    }
};