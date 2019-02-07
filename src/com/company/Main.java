package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    private double money;

    public static void main(String[] args) {
        Main main = new Main();
        String choice1,choice2,choice3,choice4,choice5,choice6,choice7,choice8,choice9 ,outPut="";
        List<String> rice = new ArrayList<>();
        List<String> meat = new ArrayList<>();
        List<String> beans = new ArrayList<>();
        List<String> salsa = new ArrayList<>();
        List<String> veggies = new ArrayList<>();
        List<String> cheese = new ArrayList<>();
        List<String> guacamole = new ArrayList<>();
        List<String> queso = new ArrayList<>();
        List<String> sourCream = new ArrayList<>();

        Collections.addAll(rice,"white rice","brown rice","no rice");
        Collections.addAll(meat,"chicken","steak","carnidas","chorizo","sofritas","veggies");
        Collections.addAll(beans, "pinto beans","black beans","no beans");
        Collections.addAll(salsa,"mild salsa","medium salsa","hot salsa","all","no salsa");
        Collections.addAll(veggies, "lettuce","fajita veggies","all","no veggies");
        Collections.addAll(cheese,"cheese","no cheese");
        Collections.addAll(guacamole,"guacamole","no guacamole");
        Collections.addAll(queso,"queso","no queso");
        Collections.addAll(sourCream,"sour cream","no sour cream");

        for (int i = 1; i <26 ; i++) {
            main.setMoney(3);
            choice1 = main.getChoice(rice);
            choice2 = main.getChoice(meat);
            choice3 = main.getChoice(beans);
            choice4 = main.getChoice(salsa);
            choice5 = main.getChoice(veggies);
            choice6 = main.getChoice(cheese);
            choice7 = main.getChoice(guacamole);
            choice8 = main.getChoice(queso);
            choice9 = main.getChoice(sourCream);
            outPut = "";
            if(!choice5.equals("")){
                outPut = choice5 + ", ";
            }
            if(!choice6.equals("")){
                outPut += choice6 + ", ";
            }
            if(!choice7.equals("")){
                outPut += choice7 + ", ";
            }
            if(!choice8.equals("")){
                outPut += choice8 + ", ";
            }
            if(!choice9.equals("")){
                outPut += choice9 + ", ";
            }

            System.out.println("\nBurrito " +i +": " +choice1+", "+ choice2+ ", "+
                    choice3+ ", "+choice4+ ", "+ outPut + "price = $" + main.getMoney()+"\n");
        }
    }

    public String getChoice(List<String> options){
        int random = (int)(Math.random() * options.size());
        String choice = options.get(random);

        if(choice.equals("all")){
            String choices = "";
            int index = options.indexOf("all");

            //add all choices
            for(int i = 0; i < index - 1 ; i++){
                choices += options.get(i) + ", ";
                addMoney(0.5);
            }
            choices += options.get(index - 1 );
            addMoney(0.5);
            choice = choices;
        } else if(choice.equals("no veggies")||choice.equals("no cheese")|| choice.equals("no guacamole") || choice.equals("no queso")||choice.equals("no sour cream")){
            choice = "";
        } else if (choice.equals("no rice") || choice.equals("no beans")||choice.equals("no salsa")) {
            //do nothing
        } else {
            addMoney(0.5);
        }
        if(!choice.equals("")){
            System.out.print(choice + "=" + getMoney() + ", ");
        }
        return choice;
    }

    public double getMoney(){
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void addMoney(double amount){
        money += amount;
    }
}