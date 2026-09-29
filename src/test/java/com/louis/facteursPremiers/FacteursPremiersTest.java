package com.louis.facteursPremiers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FacteursPremiersTest {
    @Test
    void test_generate_1_retourne_liste_vide() {
        Assertions.assertThat(FacteursPremiers.generate(1)).isEmpty();
    }
}