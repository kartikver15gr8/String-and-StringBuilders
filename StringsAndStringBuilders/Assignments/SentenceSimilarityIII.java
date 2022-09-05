package com.StringsAndStringBuilders.Assignments;

import java.util.Arrays;

public class SentenceSimilarityIII {
    public static void main(String[] args) {
        String sentence1 = "Luky";
        String sentence2 = "Lucccky";
        System.out.println(areSentenceSimilar(sentence1, sentence2));
    }

    static boolean areSentenceSimilar(String sentence1, String sentence2) {
        String[] a= sentence1.split(" ");
        String[] b= sentence2.split(" ");
        int i = 0, j = 0, n = a.length, m = b.length;
        while (i < n && j < m) {
            if (!a[i].equals(b[j])) {
                break;
            }
            i++;
            j++;
        }

        if(i==n|| j==m) return true;

        int p = n - 1, q = m - 1;

        while (p >= i && q >= j) {
            if (!a[p].equals(b[q])) return false;
            p--;
            q--;
        }
        return p<i||q<j;
    }
}
