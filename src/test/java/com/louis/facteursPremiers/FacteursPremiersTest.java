package com.louis.facteursPremiers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FacteursPremiersTest {
    @Test
    void test_generate_1_retourne_liste_vide() {
        Assertions.assertThat(FacteursPremiers.generate(1)).isEmpty();
    }

    @Test
    void test_generate_8_retourne_2_2_2() {
        Assertions.assertThat(FacteursPremiers.generate(8)).containsExactly(2, 2, 2);
    }

    @Test
    void test_generate_6_retourne_2_3() {
        Assertions.assertThat(FacteursPremiers.generate(6)).containsExactly(2, 3);
    }
}