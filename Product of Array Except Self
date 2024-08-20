class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int size = nums.size(); // Store the size of the input vector
        vector<int> output(size); // Initialize the output vector with the same size as the input
      
        // Initialize the left running product as 1
        int leftProduct = 1;
        // Calculate the running product from the left for each element
        for (int index = 0; index < size; ++index) {
            output[index] = leftProduct;  // Set the current output element as the product so far from the left
            leftProduct *= nums[index];   // Update the leftProduct to include the current number
        }
      
        // Initialize the right running product as 1
        int rightProduct = 1;
        // Calculate the running product from the right for each element
        for (int index = size - 1; index >= 0; --index) {
            output[index] *= rightProduct; // Multiply the current output element by the product so far from the right
            rightProduct *= nums[index];   // Update the rightProduct to include the current number
        }
      
        return output; // Return the final output vector containing the product of all elements except self for each position
    }
};
