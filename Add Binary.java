class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        int j = a.length() - 1, k = b.length() - 1;

        StringBuilder result = new StringBuilder();

        while (j >= 0 || k >= 0) {
            int sum = carry;
            if (j >= 0) sum += a.charAt(j--) - '0';
            if (k >= 0) sum += b.charAt(k--) - '0';
            carry = sum / 2;
            result.append(sum % 2);
        }

        if (carry != 0) result.append(carry);

        return result.reverse().toString();
    }
}
