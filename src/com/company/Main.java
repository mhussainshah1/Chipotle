package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> rice = new ArrayList<>();
        rice.add("white rice");
        rice.add("brown rice");
        rice.add("no rice");


        List<String> meat = new ArrayList<>();
        meat.add("chicken");
        meat.add("steak");
        meat.add("carnidas");
        meat.add("chorizo");
        meat.add("sofritas");
        meat.add("veggies");


        List<String> beans = new ArrayList<>();
        beans.add("pinto beans");
        beans.add("black beans");
        beans.add("no beans");


        List<String> salsa = new ArrayList<>();
        salsa.add("mild salsa");
        salsa.add("medium salsa");
        salsa.add("hot salsa");
        salsa.add("no salsa");


        //salsa.add("mild salsa, medium salsa, hot salsa");
        List<String> veggies = new ArrayList<>();
        veggies.add("lettuce");
        veggies.add("fajita veggies");
        veggies.add("lettuce, fajita veggies");
        veggies.add("no veggies");


        System.out.println();
        for (int i = 1; i <26 ; i++) {
            String choice1 = getChoice(rice);
            String choice2 = getChoice(meat);
            String choice3 = getChoice(beans);
            String choice4 = getChoice(salsa);
            String choice5 = getChoice(veggies);
            System.out.println("Burrito " +i +": " +choice1+", "+choice2+", "+choice3+", "+choice4+", "+choice5+", ");
        }


    }
    public static String getChoice(List<String> option){
        int random = (int)(Math.random() * option.size());
        String choice = option.get(random);
        return choice;
    }
}
