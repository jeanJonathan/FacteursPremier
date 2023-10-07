package facteursPremiers;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FacteursPremiersTest {
    @Test
    public void test_generate_avec_1() {
        //Before, When
        List<Integer> uneListe = FacteursPremiers.generatePour1(1);
        // On creer un resultat vide avec le constructeur par defaut de ArrayList
        List<Integer> resultat = new ArrayList<>();
        //Then
        assertEquals(resultat, uneListe);
    }

    @Test
    public void test_generate_avec_2(){
        //Before When
        List<Integer> uneListe = FacteursPremiers.generatePour2(2);
        List<Integer> resultat = Arrays.asList(1,2);
        //Then
        assertIterableEquals(resultat, uneListe);// On utilise assertArrayEquals pour comparer les listes
    }


}