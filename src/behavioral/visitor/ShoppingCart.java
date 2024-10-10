package behavioral.visitor;

public class ShoppingCart implements ShoppingCartVisitor{
    @Override
    public int visit(Groceries groceries) {

        return groceries.getCost()+10;
    }

    @Override
    public int visit(Stationary stationary) {
        return stationary.getCost()+20 ;
    }
}
