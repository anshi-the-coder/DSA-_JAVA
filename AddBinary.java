class Solution {
    public String addBinary(String a, String b) {
     int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);

        // Add the integers
        int sum = num1 + num2;

        // Convert the sum back to a binary string
        return Integer.toBinaryString(sum);
    }
}   
