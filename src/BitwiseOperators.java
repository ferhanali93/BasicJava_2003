public class BitwiseOperators {
    public static void main(String[] args) {
        int x = 10;
        int y = 2;
        int i = x^y; // i = 10 ^ 2
        System.out.println(Integer.toBinaryString(10));
        /*
        * There are three bitwise operators
        * 1. And & --> if both statements is true than output should be true which is 1
        * 2. OR | --> one of the two has to be true than output should ve true else it will be false
        * 3. XOR ^ --> if two statements are different than its true mean 1 in binary otherwise false which is 0
        * */

        // 1. XOR ^
        // step1: convert 10 and 2 into binary
        // 10 into binary is --> 1010
        // 2 into binary is -->  0010
        // using ^ operator: 1000 --> now 1000 in binary is 8--> 8, 4, 2, 1
        System.out.println(i);

    }
}
