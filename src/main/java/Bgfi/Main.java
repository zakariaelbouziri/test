package Bgfi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args){

        List<String> list = new ArrayList<>();
        List<String> li = new ArrayList<>();
        Bgfi bgfi = new Bgfi();

        Collections.addAll(list,"8","9","89","99","88","37","56");
        List<List<String>> result = bgfi.partition(list,4);
        System.out.println("Liste initiale 1 " + list);
        System.out.println("Liste Finale 1 " + result);


        Collections.addAll(li,"8","9","89","99","88","37","56","89","99","88","37","56","89","99","88","37","56","89","99","88","37","56");
        List<List<String>> resultat = bgfi.partition(li,1);
        System.out.println("Liste initiale" + li);
        System.out.println("Liste Finale" + resultat);

    }


}
