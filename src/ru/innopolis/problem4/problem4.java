package ru.innopolis.problem4;
// your solution here
//fix all the errors including package errors

public class problem4 {
    public static void main(String[] args) {
        Product pr1 = new Product("a", 1);
        Product pr2 = new Product("b", 2);
        Product pl1 = new Pallet("pl1", new Product[]{pr1, pr2});
        System.out.println(pl1);

        Product pl2 = new Pallet("pl2", new Product[]{pl1, pr2});
        System.out.println(pl2);
    }
}
