package com.example;

import io.github.cdimascio.dotenv.Dotenv;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.print("Użycie argumentów z linii poleceń: ");
        if( args.length == 0) {
            System.out.println("Brak argumentów");
        } else if (args.length == 1) {
            System.out.println("Jeden argument: " + args[0]);
        } else {
            System.out.println("Wiele argumentów: ");
            int i = 0;
            for (String arg : args) {
                System.out.println("argument " + i + ": " + arg);
            }        
        }

        System.out.println("Zastosowanie zmiennych środowiskowych i biblioteki dotenv");
        Dotenv dotenv = Dotenv.configure().load();
        String ENV_NAME = dotenv.get("ENV_NAME");
        System.out.println("ENV_NAME: " + ENV_NAME);

    }
}