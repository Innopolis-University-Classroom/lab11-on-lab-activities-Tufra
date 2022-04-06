package ru.innopolis.problem4;

public class Pallet extends Product {
    private Product[] products;

    public Pallet(String name) {
        super(name, 0.0);
    }

    public Pallet(String name, Product[] products) {
        super(name, 0.0);
        this.products = products;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(getName()).append(" : \n");
        for (Product product : products) {
            res.append(">").append(product.toString()).append("\n");
        }

        return res.toString();
    }
}
