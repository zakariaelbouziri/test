package Bgfi;
import java.util.*;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Bgfi {

    public List<List<String>> partition(List<String> list, int taille){

        int range = list.size()/taille + (int)((list.size() % taille == 0) ? 0 : 1);
        List<List<String>> lists = IntStream.range(0,range)
                .mapToObj(i -> list.subList(taille * i, Math.min(taille * i + taille, list.size())))
                .collect(Collectors.toList());
        return lists;
    }

}
