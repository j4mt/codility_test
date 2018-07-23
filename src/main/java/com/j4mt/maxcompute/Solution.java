package com.j4mt.maxcompute;



class Solution {
    int solution(int[] A) {
        int N = A.length;
        int[] B  = new int[N];

        for (int j = 0; j < N; j++)
            B[j] = -1;

        int result = 0;

        for (int i = 0; i < N; i++)
            if (B[A[i]] == -1)
                B[A[i]] = i;
            else
                result = Math.max(result, Math.abs(B[A[i]] - i));


//        for (int i = 0; i < N; i++)
//            for (int j = 0; j < N; j++)
//                if (A[i] == A[j])
//                    result = Math.max(result, Math.abs(i - j));
        return result;
    }

    public static void main(String[] args) {

        System.out.println(new Solution().solution(new int[] {4, 6, 2, 2, 6, 6, 1}));
        System.out.println(new Solution().solution(new int[] {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}));
    }
}
