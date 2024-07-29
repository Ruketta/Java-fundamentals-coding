package obiecte_clase;

public class Dog {
    // proprietati
    String rasa;
    int varsta;
    String nume;
    boolean

    //constructori
    public Dog () {
        // constructor deafault
        // acest constructor se genereaza automat si nu este vizibil in cod
        // atunci cand generam/scriem un constructor , construcurol default DISPARE
        // daca avem un constructor definit, putem defini in mod explicit constructorul default
    }

    public Dog (String rasa,int varsta,String nume){
        //constructor cu parametrii

        this.rasa = rasa;
        this.varsta = varsta;
        this.nume = nume;


    }
    // metode
    public String toString(){
        // metoda toStrine () transforme obiectul nostru intrun text
        // atunci cand dorim sa afisam un obiect folosin sout metoda toString se apeleaza automat
        return "rasa: " + this.rasa + ", varsta :" + this.varsta + ", nume: " + this.nume;
    }

    public boolean equals (Object o) {
        Dog obj = (Dog) o; // am facut cast de la object la dog

        if (this.nume.equals(obj.nume) && this.rasa.equals(obj.rasa && this.varsta == obj.varsta)){
            return true;
        } else {
            return false;
        }

    }
}
