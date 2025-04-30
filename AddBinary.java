import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        // Parse the binary strings using BigInteger
        BigInteger num1 = new BigInteger(a, 2);
        BigInteger num2 = new BigInteger(b, 2);

        // Add the numbers
        BigInteger sum = num1.add(num2);

        // Convert the result back to binary string
        return sum.toString(2);
    }
}
