package shopping_app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingManager {

    //proprietati :
    List<String> itemsList = new ArrayList<>();
    //constructori
    //metode


    public void start() {
        System.out.println("Shopping List App");

        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;

        while (isRunning) {

            showMenu();

            String option = scanner.next();
            scanner.nextLine();

            switch (option) {

                case "1":
                    System.out.println("Introduceti un item");

                    String item = scanner.nextLine();

                    // Variabila item de mai sus stocheaza ceea ce citim de la tastatura
                    // Metoda addItem(), primeste ca si parametru o variabila de tip String, aceasta variabila contine valoarea
                    // citita de la tastatura.
                    // addItem(item), prin aceasta linie trimitem valoarea citita din metoda start() , in metoda addItem().

                    addItem(item);
                    break;

                case "2":
                    System.out.println("Introduceti itemul pe care doriti sa modificati");
                    String oldItem = scanner.nextLine();


                    System.out.println("Intreduciti noul item");
                    String newItem = scanner.nextLine();

                    updateItem(oldItem, newItem);
                    break;

                case "3":
                    System.out.println("Introduceti un item pentru stergere");

                    String itemForDelete = scanner.nextLine();
                    deleteItem(itemForDelete);
                    break;
                case "4":
                    showItemsList();
                    break;
                case "5":
                    itemsList.clear();
                    break;
                case "6":
                    isRunning = false;
                    break;

            }
            System.out.println("-----------------------------");


        }
    }

    private void showMenu() {
        System.out.println("1.Introducere element");
        System.out.println("2.Modificare element");
        System.out.println("3.Stergere element");
        System.out.println("4.Afisare lista");
        System.out.println("5.Golire lista");
        System.out.println("6.Oprire");
    }

    public void addItem(String item) {
        boolean isPresent = isPresentInList(item);
        if (isPresent == true) {
            System.out.println("Elementul exista in lista");
        } else {
            itemsList.add(item);
        }
    }

    public boolean isPresentInList(String item) {
        boolean isPresent = false;
        for (int i = 0; i < itemsList.size(); i++) {

            String element = itemsList.get(i);

            if (item.equalsIgnoreCase(element)) {
                isPresent = true;
            }
        }
        return isPresent;
    }

    public void showItemsList() {
        for (String element : itemsList) {
            System.out.println(element);
        }
//        for (int i = 0; i < itemsList.size(); i++) {
//            String element = itemsList.get(i);
//            System.out.println(element);
//        }

    }

    public void updateItem(String oldItem, String newItem) {

        //deleteItem(oldItem);

        //addItem(newItem);
        boolean isPresent = isPresentInList(oldItem);
        if (isPresent == false){
            System.out.println("Elementul nu se afla in lista");
        } else {
            for (int i = 0; i < itemsList.size(); i++) {
                String element = itemsList.get(i);

                //metoda set ne ajuta sa modificam un element de o pozitie anume
                if (oldItem.equalsIgnoreCase(element)) {
                    itemsList.set(i, newItem);
                }

            }

        }

    }



    public void deleteItem(String item) {
        boolean isPresent = isPresentInList(item);
        if (isPresent == true) {
            itemsList.remove(item);
        } else {
            System.out.println("Elementul nu a fost gasit");
        }
    }
}