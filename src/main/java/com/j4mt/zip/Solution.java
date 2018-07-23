package com.j4mt.zip;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int A, int B) {
        // write your code in Java SE 8
        StringBuilder zip = new StringBuilder();
        String strA = Integer.toString(A);
        String strB = Integer.toString(B);

        int length = Math.min(strA.length(), strB.length());

        for (int i = 0; i < length; i++) {

            zip.append(strA.charAt(i));
            zip.append(strB.charAt(i));
        }

        if (strA.length() != strB.length())
            if (strA.length() > length)
                for(int j = length; j < strA.length(); j++)
                    zip.append(strA.charAt(j));
            else
                for(int k = length; k < strB.length(); k++)
                    zip.append(strB.charAt(k));

        return Integer.parseInt(zip.toString());
    }

    public static void main(String[] args) {

        System.out.println(new Solution().solution(12, 56));
        System.out.println(new Solution().solution(12345, 678));
        System.out.println(new Solution().solution(123, 67890));
        System.out.println(new Solution().solution(1234, 0));
    }
}
