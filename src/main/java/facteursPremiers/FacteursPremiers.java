package facteursPremiers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class FacteursPremiers {
    public static List<Integer> generatePour1(int nombre) {
        List<Integer> listDiv = new ArrayList<>();

        return listDiv;
    }
    public static List<Integer> generatePour2(int nombre){
        List<Integer> listDiv = new ArrayList<>(); // On initialise une liste vide
        for (int i = 1; i <= nombre ; i++){
            if(nombre % i == 0){ // Si nombre est multiple de i alors c'est un diviseur donc
                listDiv.add(i);
            }
        }
        return listDiv;
    }
}
