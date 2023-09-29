package com.example.pokedex;

/**
 * @author Jin An, Delaware Technical Community College
 * ITN262: Programming III
 * Assignment 1 Starter Code
 */


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PokedexDriverCSV {
    public static Scanner scanObj = new Scanner(System.in);

    public static List<Pokemon> pokemonList = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("Importing pokemon.csv file...");

        BufferedReader br = null;
        try
        {
            br = new BufferedReader(new FileReader("src/pokemon.csv"));

            String line = "";
            //Read to skip the header
            br.readLine();
            //Reading from the second line
            while ((line = br.readLine()) != null)
            {

                String[] pokemonDetails = line.split(",");

                if(pokemonDetails.length > 0 )
                {
                    Pokemon pokemon = new Pokemon(pokemonDetails);
                    pokemonList.add(pokemon);
                }
            }
            System.out.print(pokemonList.size() + " have been imported\n");

            Menu();

        }
        catch(Exception ee)
        {
            ee.printStackTrace();
        }
        finally
        {
            try
            {
                br.close();
            }
            catch(IOException ie)
            {
                System.out.println("Error occured while closing the BufferedReader");
                ie.printStackTrace();
            }
        }

    }

    public static void Menu(){
        System.out.print("Enter attack threshold\n");
        int attackThreshold = 0;
        attackThreshold = scanObj.nextInt();

        for (int i = 0; i < pokemonList.size(); i++) {
            if (pokemonList.get(i).attack >= attackThreshold){
                System.out.println(pokemonList.get(i));
            }
        }

    }

}


