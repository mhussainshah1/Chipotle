package com.company;

import java.util.ArrayList;
import java.util.List;

//This is an example from stackoverflow.com
public class Matches {

    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("behold");
        list.add("bend");
        list.add("bet");
        list.add("bear");
        list.add("beat");
        list.add("become");
        list.add("begin");

        List <String> listClone = new ArrayList<String>();
        for (String string : list) {
            if(string.matches("(?i)(bea).*")){
                listClone.add(string);
            }
        }
        System.out.println(listClone);
    }
}
