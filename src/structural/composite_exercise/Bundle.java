package structural.composite_exercise;

import java.util.ArrayList;
import java.util.List;

public class Bundle implements ShoppingCartItems {
    private List<ShoppingCartItems> shoppingCartItems;

    public Bundle(){
        shoppingCartItems = new ArrayList<>();
    }

    public void addShoppingCartItems(ShoppingCartItems shoppingCartItem){
        shoppingCartItems.add(shoppingCartItem);
    }

    @Override
    public double getTotalPrice() {
        double sum = 0 ;
        for(ShoppingCartItems shoppingCartItem : shoppingCartItems){
              sum += shoppingCartItem.getTotalPrice();
        }

        return sum;
    }
}
