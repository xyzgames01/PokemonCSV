package com.example.pokedex;

public class Pokemon {

    public String name, type1, type2;

    public int number, total, HP, attack, defense, spAtk, spDef, speed, generation;

    public boolean legendary;
    
    public Pokemon(String[] data){
        number = Integer.parseInt(data[0]);
        name = data[1];
        type1 = data[2];
        type2 = data[3];
        total = Integer.parseInt(data[4]);
        HP = Integer.parseInt(data[5]);
        attack = Integer.parseInt(data[6]);
        defense = Integer.parseInt(data[7]);
        spAtk = Integer.parseInt(data[8]);
        spDef = Integer.parseInt(data[9]);
        speed = Integer.parseInt(data[10]);
        generation = Integer.parseInt(data[11]);
        legendary = Boolean.parseBoolean(data[12]);
    }

    public String toString(){
        return String.format(name + ", Attack:" + attack);
    }

}
