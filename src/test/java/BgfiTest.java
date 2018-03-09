package Bgfi;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Before;
import org.junit.Test;

public class BgfiTest {

    Bgfi bgfi = new Bgfi();
    List<String> list = new ArrayList<>();
    Logger logger = Logger.getLogger("LOG");

    @Test
    public void testPartition() {


        Collections.addAll(list,"8","Bigdata","89","99");
        assertEquals(bgfi.partition(list,3).size(), 2);
        logger.info("size of result list is : OK");

    }

    @Test
    public void testList() {

        Collections.addAll(list,"8","hadoop","89","99","88","377","bgfi");
        List<List<String>> result = bgfi.partition(list,4);
        List<String> sublist = new ArrayList<>();
        Collections.addAll(sublist,"8","LL","89","99");
        assertEquals(Collections.indexOfSubList(result,sublist),-1);
        logger.info("Result list contains sublists : OK");
    }

    @Test
    public void testResult() {

        Collections.addAll(list,"8","89","99","88","377","spark");
        List<String> inialList = new ArrayList<>();
        List<String> listElement = new ArrayList<>();
        List<List<String>> listOflists = new ArrayList<>();
        Collections.addAll(inialList,"8","89","99","88","377","spark");
        for (String elem : inialList) {
                List<String> myList = new ArrayList<String>(Arrays.asList(elem));
                listElement = Stream.of(myList)
                        .flatMap(x -> x.stream())
                        .collect(Collectors.toList());
            Collections.addAll(listOflists, listElement);
        }
        List<List<String>> result = bgfi.partition(list,1);
        assertEquals(list.size(),result.size());
        assertEquals(result,listOflists);
        logger.info("Result list : OK");

    }
}
