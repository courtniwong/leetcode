public class Solution {
    public int hammingDistance(int x, int y) {
        String firstBinary = new String(Integer.toBinaryString(x));
        String secondBinary = new String(Integer.toBinaryString(y));
        int difference = 0;
        int zeroes = 0;
        
        if (firstBinary.length() < secondBinary.length()){
            zeroes = secondBinary.length() - firstBinary.length();
            firstBinary = addZeroes(firstBinary, zeroes);
        } else if (secondBinary.length() < firstBinary.length()){
            zeroes = firstBinary.length() - secondBinary.length();
            secondBinary = addZeroes(secondBinary, zeroes);
        }
        
        for (int i = 0; i < firstBinary.length(); i++) {
            if (firstBinary.charAt(i) != secondBinary.charAt(i)){
                difference++;
            }
        }
        
        return difference;
    }
    
    public String addZeroes(String num, int zeroes) {
        StringBuilder newNum = new StringBuilder();
        for (int i = 0; i < zeroes; i++) {
            newNum.append("0");
        }
        newNum.append(num);
        return newNum.toString();
    }
}