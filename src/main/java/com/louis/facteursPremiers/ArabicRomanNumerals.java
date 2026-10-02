package com.louis.facteursPremiers;

public class ArabicRomanNumerals {
    public static String convert(int nbr){
        int[] valeurs = {50, 40, 10, 9, 5, 4, 1};
        String[] symboles = {"L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder resultat = new StringBuilder();

        for (int i = 0; i < valeurs.length; i++) {
            while (nbr >= valeurs[i]) {
                resultat.append(symboles[i]);
                nbr -= valeurs[i];
            }
        }
        return resultat.toString();
    }
}
