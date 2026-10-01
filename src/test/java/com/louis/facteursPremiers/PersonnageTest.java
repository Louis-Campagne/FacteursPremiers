package com.louis.facteursPremiers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonnageTest {

    @Test
    void tourner_1_fois_devrait_retourner_EST() {
        Personnage monPersonnage = new Personnage();
        String orientation = monPersonnage.tourner(1);
        Assertions.assertThat(orientation).isEqualTo("EST");
    }

    @Test
    void tourner_2_fois_devrait_retourner_SUD() {
        Personnage monPersonnage = new Personnage();
        String orientation = monPersonnage.tourner(2);
        Assertions.assertThat(orientation).isEqualTo("SUD");
    }

    // Cas limite
    @Test
    void tourner_0_fois_devrait_retourner_NORD(){
        Personnage monPersonnage = new Personnage();
        String orientation = monPersonnage.tourner(0);
        Assertions.assertThat(orientation).isEqualTo("NORD");
    }
    @Test
    void tourner_moins_2_fois_devrait_retourner_SUD(){
        Personnage monPersonnage = new Personnage();
        String orientation = monPersonnage.tourner(-2);
        Assertions.assertThat(orientation).isEqualTo("SUD");
    }

    @Test
    void tourner_10_fois_devrait_retourner_SUD(){
        Personnage monPersonnage = new Personnage();
        String orientation = monPersonnage.tourner(10);
        Assertions.assertThat(orientation).isEqualTo("SUD");
    }
}