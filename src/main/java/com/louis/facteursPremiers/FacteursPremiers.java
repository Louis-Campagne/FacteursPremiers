package com.louis.facteursPremiers;


import java.util.ArrayList;
import java.util.List;

public class FacteursPremiers {
    public static List<Integer> generate(int n) {
        List<Integer> facteurs = new ArrayList<>();
        while (n % 2 == 0) {
            facteurs.add(2);
            n /= 2;
        }
        return facteurs;
    }
}
