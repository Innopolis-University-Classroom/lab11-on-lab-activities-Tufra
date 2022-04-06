package ru.innopolis.problem1;
// your solution here
//fix all the errors including package errors

public class problem1 {
    public static void main(String[] args) {
        Workshop ws = new Workshop();
        ws.setSpec(() -> System.out.println("Assemble"));

        ws.operate();

        ws.setSpec(() -> System.out.println("Disassemble"));

        ws.operate();
    }
}
