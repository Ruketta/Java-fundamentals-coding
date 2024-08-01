package obiecte_clase;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Keyword STATIC
 * - Se foloseste pentru: prorietati, metode, calse (nu se foloseste pentru constructori)
 * - Atunci cand o proprietate/VARIABILA/CLASA/METODA este statica, se aloca spatiu in memorie la pronirea aplicatiei
 * - Intro metoda statica NU putem apela proprietati (variabile) sau metode care nu sunt statice
 * - Pentru a apela o proprietate/metoda/clasa statica, folosim NUMELE CLASEI . NUMELE PROPRIETATI/METODA/CLASEI -> Dog.bark() nu folosim instanta clasei, adica rex.bark()
 * - Elemente statice sunt independente de obbiecte, aceaste depinde de clasa nu de instanta lor\
 * - Definire variabile
 */
public class Main {
    public static void main(String[] args) {
        Dog rex = new Dog("Labrador", 2, "Rex");
        String rexText = rex.toString();
        System.out.println(rexText);

        System.out.println(rex);

        Dog lady = new Dog ("Bichon", 5, "Lady");
        System.out.println(lady);

        // Dog rex2 = new Dog ("Ciobanesc", 2, "Rex"); -> resultat: Obiectele sunt egale

        Dog rex2 = new Dog ("Ciobanesc", 2, "Rex");

        // NU FOLOSIM "==" ATUNCI CAND DORIM SA COMPARAM 2 OBIECTE
        if (rex == rex2) {
            System.out.println("Obiectele sunt egale");
        } else {
            System.out.println("Obiectele nu sunt egale");
        }
        // FOLOSIM ".EQUALS()" PENTRU A COMPARA 2 OBIECTE
        if (rex.equals(rex2)) {
            System.out.println("Obiectele sunt egale");
        } else {
            System.out.println("Obiectele nu sunt egale");
        }

        Dog.bark(); // folosim clasa Dog si nu obiectele de tipul clasei Dog
        rex.apport();

        //addDog();
        dogManagers();

    }
    public static void addDog (){
        System.out.println("Add dog");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert name: ");
        String name = scanner.nextLine();

        System.out.println("Insert race: ");
        String race = scanner.nextLine();

        System.out.println("Insert age: ");
        int age = scanner.nextInt();

        scanner.close();
        // Dog - tipul variabilei in acest caz calsa dog
        // variabilaDeTipDog - este numele variabilei
        // = - operatorul de atribuire (initializare)
        // new Dog() -reprezinta apelul constructorului din clasa Dog

        Dog variabilaDeTipDog = new Dog(race, age, name);
        // La definirea(declararea) unei variabile avem doua elemente
        // 1. tipul variabilei (String, Int, int, double, boolean,etc,...)
        // 2. numele variabilei (rex, listaNumelePare, pret,
        Integer number = 0;
        //tip nume_var = valoare

        // Atunci cand folosim numele variabilei inseamna ca o apelam (folosim)
        number = 10;
        System.out.println(number);

        // ATENTIE!!!! La folosirea/apelul variabilei nu mai scriem tipul acesteia (folosim doar numer, fara Integer)
        // Integer number = 100;

        String text = " ";
        StringBuilder builder = null;

        //return variabilaDeTipDog;
    }

    public static void dogManagers() {
        List<Dog> dogList = new ArrayList<>();

        Dog dog1 = new Dog("bishon", 2, "Max");
        Dog dog2 = new Dog("labrador", 5, "Ben");
        Dog dog3 = new Dog("chivauhva", 3, "Picky");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);

        for (int i = 0; i < dogList.size(); i++) {
            Dog element =dogList.get(i);

            System.out.println(element);
        }
    }
}