package com.davis;

import java.util.Locale;

public class Answers {
    public static int answer1() {
        int i = 13, soma = 0, k = 0;
        while (k < i) {
            k += 1;
            soma += k;
        }
        return soma;
    }

    public static String answer2(int num) {
        int x = 0, y = 1, z;

        if (num >= 0) {
            while (num > y) {
                z = x + y;
                x = y;
                y = z;
            }
            if ((num == 0) || (num == y)) { return "Pertence a sequencia de Fibonacci"; }
        }

        return "Nao pertence a sequencia de Fibonacci";
    }

    public static String answer4() {
        Locale.setDefault(Locale.US);
        double fatSP = 67836.43;
        double fatRJ = 36678.66;
        double fatMG = 29229.88;
        double fatES = 27165.48;
        double fatOutros = 19849.53;
        double total = fatSP + fatRJ + fatMG + fatES + fatOutros;

        return "SP = " + String.format("%.2f",(fatSP/total)*100) + "% " +
                "RJ = " + String.format("%.2f",(fatRJ/total)*100) + "% " +
                "MG = " + String.format("%.2f",(fatMG/total)*100) + "% " +
                "ES = " + String.format("%.2f",(fatES/total)*100) + "% " +
                "Outros = " + String.format("%.2f",(fatOutros/total)*100) + "%";
    }

    public static String answer5(String str) {
        StringBuilder strReverse = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            strReverse.append(str.charAt(str.length() - i - 1));
        }

        return strReverse.toString();
    }
}
