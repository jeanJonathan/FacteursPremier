package facteursPremiers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class FacteursPremiers {
    // Methode generate pour le scenario 1
    public static List<Integer> generatePour1(int nombre) {
        List<Integer> listDiv = new ArrayList<>();

        return listDiv;
    }
    // Methode generate pour le scenario 2
    public static List<Integer> generatePour2(int nombre){
        List<Integer> listDiv = new ArrayList<>(); // On initialise une liste vide
        if(nombre == 2){
            listDiv.add(2);
        }
        return listDiv;
    }
    // Methode generate pour le scenario 3
    public static List<Integer> generatePour6(int nombre){
        List<Integer> listDiv = new ArrayList<>(); // On initialise une liste vide
        for (int i = 2; i < nombre ; i++){
            if(nombre % i == 0){ // Si nombre est multiple de i alors c'est un diviseur donc
                listDiv.add(i);
            }
        }
        return listDiv;
    }
    // Methode generate pour le scenario 4 faisant valider tout les scenario
    public static List<Integer> generatePour8(int nombre){
        //La fonction fonctionne egalement pour le scenario 3 (voir td)
        List<Integer> listDiv = new ArrayList<>();
        int i = 2;
        while(i <= nombre){ // quand i devient superieur a nombre la boucle de se termine
            if(nombre % i == 0){
                listDiv.add(i);
                nombre /= i;
            } else {
                i++;
            }
        }
        return listDiv;
    }
}
