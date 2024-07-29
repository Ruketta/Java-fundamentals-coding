package operacti_cu_liste;

/**
 * 1. sa se defineasca un array de 10 elemente, sa se afiseze in acelas array in consola
 * 2. Sa se afiseze array-ul invers de la coada spre inceput
 */

public class Main  {
    public static void main(String[] args) {
      int [] numbers = {8,1,2,33,4,20,6,7,17,9};
      //                8 1 2  3 4  5 6 7  8 9
      afisareArray(numbers);

        System.out.println("-------------------------------------");


        afisareArray(numbers);

      for (int i = numbers.length-1; i >= 0; i--) {
          int element = numbers[i];

          System.out.println(element + ", ");
      }
    }

    public static void  afisareArray (int [] numbers ) {
        for (int i = 0; i < numbers.length; i++ ) {
            int elment = numbers [numbers.length-1-i];
            // pentru afisa elementele invers, folosim linia de mai jos
            // int element = numbers[numbers.lenght-1-i];

            System.out.println(elment);
        }
    }

}
gi