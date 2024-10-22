package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Exercise22 {

    public static List<String> createArrayList() {

        List<String> elementList = new ArrayList<>();

        elementList.add("GKFFD");
        elementList.add("TNANA");
        elementList.add("MPMSL");
        elementList.add("PSWME");
        elementList.add("LZMLF");
        elementList.add("JYEBV");
        elementList.add("YELNT");
        elementList.add("JSNKR");
        elementList.add("JFESF");
        elementList.add("TMJLL");

        return elementList;

    }

    public static void printElementsAndIndex(List<String> customList) {
        for (String c: customList) {
            System.out.println("El elemento vale " + c + " y su índice en la lista es " + customList.indexOf(c));
        }
    }

    public static boolean addElementToList(List<String> customList, String element) {
        customList.add(element);
        return true;

    }

    public static void main(String[] args) {
        createArrayList();
        String element = "AAAAA";
        addElementToList(createArrayList(), element);
        printElementsAndIndex(createArrayList());

    }


}
