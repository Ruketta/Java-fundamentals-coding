package shopping_app;

/**
 * Modificator de acces
 * 1. private - Elementele private sunt accesibile DOAR in interiorul clasei
 * 2. default - Elementele default (fara modificator de acces) sunt vizibile la nivel de pachet, adica sunt vizibile din toate clasele din pachert
 * 3. protected - Elementele protected sunt vizibile la nivel de pachet ca si default, dar in relatii de mostenire elementele din casa
 * sunt vizibile de clasele copil aflate in alte pachete
 * EXEMPLU :
 * - Avem pachetul A care contine clasa Animal, toate elementele au modificatorul de acces protected
 * - Avem pachetul B care contine clasa Caine ( copilul clasei Animal ) aceasta poate vedea toate elmenetle din parinte
 * 4. public - Elementele public sunt vivibile peste tot
 */

public class Main {

    public static void main(String[] args) {

        ShoppingManager shoppingManager = new ShoppingManager();
        shoppingManager.start();


    }
}
