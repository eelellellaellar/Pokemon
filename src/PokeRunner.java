import acm.program.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PokeRunner extends ConsoleProgram {

    public void run() {
        loadStats();
    }

    public void init() {
        canvas = new PokeCanvas();
        add(canvas);
        canvas.display();  // sample canvas method call
        println("Hello LBYCPEI!");
        println("This is the next line!");

    }
    private void loadStats(){
        ArrayList<Pokemon> list = new ArrayList<>();
        String[] arr;

        try {
            FileReader fileReader = new FileReader("POKEDEXINFO.txt");
            Scanner text = new Scanner(fileReader);
            String[] pokemonStats = null;

                    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
                    String pokemonName = readLine("Enter a Pokemon name: ");  // Read user input

            while (text.hasNext()) {
                String line = text.nextLine();
                System.out.println(line); // working!
                pokemonStats = line.split(",");
                System.out.println(Arrays.toString(pokemonStats));
                System.out.println(Arrays.toString(pokemonStats));
                System.out.println(pokemonStats[0]); // Names
                System.out.println(pokemonStats[1]); // Weights
                System.out.println(pokemonStats[2]); // Heights
                System.out.println(Double.parseDouble(pokemonStats[3]));//Attack
                System.out.println(Double.parseDouble(pokemonStats[4]));// Defense
                System.out.println(Double.parseDouble(pokemonStats[5]));// Stamina
                System.out.println(pokemonStats[6]); // Types

                pokemonStats[0]
            Integer.parseInt(pokemonStats[1])
            Double.parseDouble(pokemonStats[2])
                        Double.parseDouble(pokemonStats[3]), Double.parseDouble(pokemonStats[4]), Double.parseDouble(pokemonStats[5]), Double.parseDouble(pokemonStats[6]), pokemonStats[7]


                if (pokemonStats[0].equals(pokemonName)) {
                    if (pokemonStats[0].equals("Torchic")) {
                        Pokemon torchic = new Torchic(pokemonStats[0], Integer.parseInt(pokemonStats[1]), Double.parseDouble(pokemonStats[2]), Double.parseDouble(pokemonStats[3]), Double.parseDouble(pokemonStats[4]), Double.parseDouble(pokemonStats[5]), Double.parseDouble(pokemonStats[6]), pokemonStats[7]);
                        println(torchic.getName());
                        println(torchic.getPokedexNum());
                    }
                }
            }System.out.println(Arrays.toString(pokemonStats));

        } catch (FileNotFoundException e) {
            System.out.println("File does not Exist");
        }
/*
        try {
            FileReader fileReader = new FileReader("POKEDEXINFO.txt");
            Scanner text = new Scanner(fileReader);
            String[] pokemonStats = null;
            while (text.hasNext()) {
                String line = text.nextLine();
                arr = line.split(" ,");
                Class myClass = Class.forName(arr[0]);
                int dexnum = Integer.parseInt(arr[1]);
                double w = Double.parseDouble(arr[2]);
                double h =  Double.parseDouble(arr[3]);
                double a =Integer.parseInt(arr[4]);
                double d = Integer.parseInt(arr[5]);
                double s =  Integer.parseInt(arr[6]);


                Scanner myObj = new Scanner(System.in);  // Create a Scanner object
                String pokemonName = readLine("Enter a Pokemon name: ");  // Read user input

                println(arr[0]);

                Constructor cons = myClass.getConstructor(String.class, int.class, double.class, double.class, int.class, int.class, int.class, String.class);
                Object instance = cons.newInstance(arr[0], dexnum, w, h, a, d, s, arr[7]);
                list.add((Pokemon)instance);



            }
        } catch (Exception e) {
            System.out.println(e.toString());
            println(e.toString());
        }
    }


    /* Solves NoClassDefFoundError */
    public static void main(String[] args) {
        new PokeRunner().start(args);
    }

    private PokeCanvas canvas;
}
