package com.louis.facteursPremiers;


import java.util.ArrayList;
import java.util.List;

public class FacteursPremiers {
    public static List<Integer> generate(int n) {
        List<Integer> facteurs = new ArrayList<>();
        int diviseur = 2;

        while (n > 1) {
            while (n % diviseur == 0) {
                facteurs.add(diviseur);
                n /= diviseur;
            }
            diviseur++;
        }
        return facteurs;
    }
}
