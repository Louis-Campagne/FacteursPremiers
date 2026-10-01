package com.louis.facteursPremiers;


public class Personnage {
    private final String[] orientations = {"NORD", "EST", "SUD", "OUEST"};

    public String tourner(int fois) {
        return orientations[fois % 4];
    }
}
