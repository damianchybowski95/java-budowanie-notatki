package com.example;

public class Main {

    // Słowo kluczowe 'final' oznacza, że tej zmiennej nie można ponownie przypisać wartości po jej początkowym ustawieniu.
    public final double SHORT_PI = 3.1415;
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Minimalne i maksymalne wartości zmiennych
        System.out.println("Sizes of variable types");
        System.out.println("    Byte max: " + Byte.MAX_VALUE + " Byte min: " + Byte.MIN_VALUE);
        System.out.println("    Short max: " + Short.MAX_VALUE + " Short min: " + Short.MIN_VALUE);
        System.out.println("    Char max: " + (int) Character.MAX_VALUE + " Char min: " + (int) Character.MIN_VALUE);
        System.out.println("    Integer max: " + Integer.MAX_VALUE + " Integer min: " + Integer.MIN_VALUE); 
        System.out.println("    Float max value: " + Float.MAX_VALUE + " Float min value: " + Float.MIN_VALUE);
        System.out.println("    Double max value: " + Double.MAX_VALUE + " Double min value: " + Double.MIN_VALUE);
        System.out.println("    Long max value: " + Long.MAX_VALUE + " Long min value: " + Long.MIN_VALUE);

        Byte byteVariable = 127;
        Short shortVariable = 32767;
        Integer intVariable = 2147483647;
        Long longVariable = 9223372036854775807L;
        Float floatVariable = 3.4028235E38f;
        Double doubleVariable = 1.7976931348623157E308;
        Character charVariable = 'A';
        Boolean boolVariable = true;

        System.out.println("Variables and example values:");
        System.out.println("    Byte variable : " + byteVariable );
        System.out.println("    Short variable : " + shortVariable );
        System.out.println("    Integer variable : " + intVariable );
        System.out.println("    Long variable : " + longVariable );
        System.out.println("    Float variable : " + floatVariable );
        System.out.println("    Double variable : " + doubleVariable );
        System.out.println("    Character variable : " + charVariable );
        System.out.println("    Boolean variable : " + boolVariable);

        float fNumber1 = 1.111111111111111F;
        float fNumber2 = 1.111111111111111F; // Liczba zmienno przecinkowa z F to float, a bez tego to double
        double dNumber1 = 1.111111111111111; // Istotnym jest to że nie ma tutaj f na końcu, to nie jest liczba float, tylko double
        double dNumber2 = 1.111111111111111; // Gdyby f było na końcu to doszłoby do błędów precyzji obliczeń.

        System.out.println("Precision of float and double:");
        System.out.println("    Floats precission error: " + fNumber1 + " + " + fNumber2 + " = " + (fNumber1 + fNumber2));
        System.out.println("    Double variable calculation: " + dNumber1 + " + " + dNumber2 + " = " + (dNumber1 + dNumber2));

        float thousand = 1e+3F; // Naukowa notacja, to domyślnie double, lub float jeśli dodamy F na końcu.
        System.out.println("Można używać naukowej notacji liczb: 1e+3 = " + thousand );

        long bigNumber = 123_456_789_123_123L; // L na końcu oznacza że to liczba typu long.
        System.out.println("Można używać _ do oddzielania cyfr: " + bigNumber);

        // Konwersja typów, z mniejszych na większe zachodzi zwyczajnie.
        int smInt = 10;
        long longNumber = smInt;
        System.out.println("Conversion from int " + smInt + " to long = " + longNumber);

        // Konwersja z większych na mniejsze wymaga np.: rzutowania.
        double double1 = 1.234;
        int int1 = (int) double1; // Użycie rzutowania (int) powoduje utratę części dziesiętnej
        System.out.println("Konwersja " + double1 + " z double na int: " + int1);

        long bigLong = 211200000234L;
        int int2 = (int) bigLong; // Użycie rzutowania (int)
        System.out.println("Konwersja z long " + bigLong + " na int: " + int2 + " Przy takim rzutowaniu dochodzi do utarty wartości"); // Uwaga! Może dojść do utraty danych

        String favNumber = Long.toString(bigLong); // Konwersja z long na string
        System.out.println("Konwersja z long na string: " + favNumber);

        String favInt = Integer.toString(30033); // Konwersja z int na string
        System.out.println("Konwersja z int na string: " + favInt);

         // Operacje matematyczne
         System.out.println("5 + 4 = " + (5+4));
         System.out.println("5 - 4 = " + (5-4));
         System.out.println("5 * 4 = " + (5*4));
         System.out.println("5 / 4 = " + (5/4));
         System.out.println("5F / 4F = " + (5F/4F));
         System.out.println("5.0 / 4.0 = " + (5.0/4.0));
         System.out.println("5 % 4 = " + (int)(5F % 4F));

        int incMe = 0;
        System.out.println("incMe++ = " + incMe++);
        System.out.println("++incMe = " + ++incMe);

        // Metody matematyczne
        System.out.println("Math.abs(-1) = " + Math.abs(-1));
        System.out.println("Math.ceil(4.25) = " + Math.ceil(4.25));
        System.out.println("Math.floor(4.25) = " + Math.floor(4.25));
        System.out.println("Math.round(4.25) = " + Math.round(4.25));
        System.out.println("Math.round(4.75) = " + Math.round(4.75));
        System.out.println("Math.max(4, 5) = " + Math.max(4, 5));
        System.out.println("Math.min(4, 5) = " + Math.min(4, 5));
        System.out.println("Math.pow(2, 2) = " + Math.pow(2, 2));
        System.out.println("Math.sqrt(4) = " + Math.sqrt(4));
        System.out.println("Math.PI = " + Math.PI);

        // Losowe liczby
        int minNum = 5;
        int maxNum = 20;
        int randNum = minNum + (int)(Math.random() * ((maxNum - minNum) + 1));
        System.out.println("Random Number between " + minNum + " and " + maxNum + " = " + randNum);

        // Stringi, mają wiele metod
        String name = "Damian";
        String fullName = name + " Kowalski";
        fullName += " is my name";
        String dDog = "K" + 9;
        System.out.println("First letter of my name: " + name.charAt(0));
        System.out.println("Does it contain Damian: " + fullName.contains("Damian"));

        // Porównywanie stringów nie wykonuje się z pomocą == w Javie, tylko z pomocą metody equals
        Boolean isNameDamian = name.equals("Damian");
        System.out.println("Is name Damian: " + isNameDamian);
        System.out.println("Does \"dog\" equal \"cat\"? : " + ("dog".equals("cat")) );
        System.out.println("Jest też metoda compareTo która zamiast tego zwraca 0 jeśli stringi są równe: " + name.compareTo("Damian") + " oraz wartości dodatnie gdy się pokrywają");

        // Array ze String
        String[] words = fullName.split(" ");
        System.out.println("Splitting the words in the sentence: ");
        for( String x : words ) {
            System.out.println("    " + x);
        }

        // Można używać string buildera zamiast String, co ma coś do czynienia z wydajnością i wątkami
        StringBuilder randSB = new StringBuilder("A random value");
        System.out.println("String builder: " + randSB);
        System.out.println("3rd index: " + randSB.charAt(3));
        // Bodobnie jak StringBuilder'a można używać string buffer, który działa jakoś z wątkami.
        StringBuffer randBuff = new StringBuffer("A random value");
        System.out.println("String buffer: " + randBuff);
    }
}