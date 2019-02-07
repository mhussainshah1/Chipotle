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
        salsa.add("all");
        salsa.add("no salsa");

        List<String> veggies = new ArrayList<>();
        veggies.add("lettuce");
        veggies.add("fajita veggies");
        veggies.add("all");
        veggies.add("no veggies");

        List<String> cheese = new ArrayList<>();// yes/no
        cheese.add("chesse");
        cheese.add("no cheese");

        List<String> guacamole = new ArrayList<>();//yes/no
        guacamole.add("guacamole");
        guacamole.add("no guacamole");

        List<String> queso = new ArrayList<>();// yes/no
        queso.add("queso");
        queso.add("no queso");

        List<String> sourCream = new ArrayList<>();//: yes/no
        sourCream.add("sour cream");
        sourCream.add("no sour cream");

        System.out.println();
        String choice1,choice2,choice3,choice4,choice5,choice6,choice7,choice8,choice9;
        for (int i = 1; i <26 ; i++) {
            choice1 = getChoice(rice);
            choice2 = getChoice(meat);
            choice3 = getChoice(beans);
            choice4 = getChoice(salsa);

            choice5 = getChoice(veggies);
            if(choice5.equals("no veggies")){
                choice5 = "";
            } else{
                choice5 += ", ";
            }

            choice6 = getChoice(cheese);
            choice7 = getChoice(guacamole);
            choice8 = getChoice(queso);
            choice9 = getChoice(sourCream);

            System.out.println("Burrito " +i +": " +choice1+", "+
                    choice2+ ", "+
                    choice3+ ", "+
                    choice4+ ", "+
                    choice5+
                    choice6+ ", "+
                    choice7+ ", "+
                    choice8+ ", "+
                    choice9);
        }
    }

    public static String getChoice(List<String> options){
        int random = (int)(Math.random() * options.size());
        String choice = options.get(random);
        if(choice.equals("all")){
            String choices = "";
            int index = options.indexOf("all");
            //add all choice
            for (int i = 0; i < index ; i++) {
                choices += options.get(i) + ", ";
                if(i == (index -1)){
                    choices += options.get(i);
                }
            }
            choice = choices;
        }
        return choice;
    }
//    public static String getChoices(){
//
//    }

//    public static List<String> getRandom(){
//
//    }
}
