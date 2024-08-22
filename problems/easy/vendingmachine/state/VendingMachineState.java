package problems.easy.vendingmachine.state;

import problems.easy.vendingmachine.enums.Coin;
import problems.easy.vendingmachine.enums.Note;
import problems.easy.vendingmachine.products.Product;

public interface VendingMachineState {
    void selectProduct(Product product);

    void insertCoin(Coin coin);

    void insertNote(Note note);

    void dispenseProduct();

    void returnChange();
}