package behavioral.visitor;

public interface ShoppingCartVisitor {

    public int visit(Groceries groceries);
    public int visit(Stationary stationary);
}
