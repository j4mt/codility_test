package com.j4mt.countryFinder;

public class Solution {

    public int solution(int[][] A) {
        // write your code in Java SE 8
        int countryCnt = 0;

        int N = A.length;
        int M = A[0].length;

        boolean[][] V = new boolean[N][M];

        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++)
                if (!V[i][j]) {

                    V[i][j] = true;

                    traverse(A, V, N, M, i, j);
                    countryCnt++;
                }

        return countryCnt;
    }

    public void traverse(int[][] A, boolean[][] V, int N, int M, int i, int j) {

        if (i < N - 1 && A[i][j] == A[i + 1][j] && !V[i + 1][j]) {

            V[i + 1][j] = true;
            traverse(A, V, N, M, i + 1, j);
        }

        if (i > 0 && A[i][j] == A[i - 1][j] && !V[i - 1][j]) {

            V[i + 1][j] = true;
            traverse(A, V, N, M, i + 1, j);
        }

        if (j < M - 1 && A[i][j] == A[i][j + 1] && !V[i][j + 1]) {

            V[i][j + 1] = true;
            traverse(A, V, N, M, i, j + 1);
        }

        if (j > 0 && A[i][j] == A[i][j - 1] && !V[i][j - 1]) {

            V[i][j - 1] = true;
            traverse(A, V, N, M, i, j - 1);
        }
    }

    public static void main(String[] args) {

        System.out.println(new Solution().solution(new int[][]{
                {5, 4, 4},
                {4, 3, 4},
                {3, 2, 4},
                {2, 2, 2},
                {3, 3, 4},
                {1, 4, 4},
                {4, 1, 1}
        }));
    }
}
