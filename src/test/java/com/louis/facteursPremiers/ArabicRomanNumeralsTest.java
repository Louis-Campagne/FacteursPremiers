package com.louis.facteursPremiers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ArabicRomanNumeralsTest {
    @Test
    void convert_1_devrait_retouner_I() {
        Assertions.assertThat(ArabicRomanNumerals.convert(1)).isEqualTo("I");
    }

    @Test
    void convert_2_devrait_retourner_II(){
        Assertions.assertThat(ArabicRomanNumerals.convert(2)).isEqualTo("II");
    }

    @Test
    void convert_moins_1_devrait_retourner_erreur_pas_de_chiffre_negatif(){
        Assertions.assertThat(ArabicRomanNumerals.convert(-1)).isEqualTo("Erreur pas de chiffre negatif");

    }
    @Test
    void convert_0_devrait_retourner_erreur_pas_de_chiffre_0(){
        Assertions.assertThat(ArabicRomanNumerals.convert(0)).isEqualTo("Erreur pas de chiffre 0");

    }
    @Test
    void convert_49_devrait_retourner_XLIX(){
        Assertions.assertThat(ArabicRomanNumerals.convert(49)).isEqualTo("XLIX");

    }
}