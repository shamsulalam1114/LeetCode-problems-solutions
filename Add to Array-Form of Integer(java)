class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> integerList = new ArrayList<>();
        int carry = 0;
        int i = num.length - 1;

        while (i >= 0 || k > 0) {
            int result = (i >= 0 ? num[i--] : 0) + k % 10 + carry;
            integerList.add(result % 10);
            carry = result / 10;
            k = k / 10;
        }

        if (carry != 0) {
            integerList.add(carry);
        }

        Collections.reverse(integerList);
        return integerList;
    }
}
