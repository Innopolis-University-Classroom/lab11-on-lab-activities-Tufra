package ru.innopolis.problem1;

public class Workshop {
    private Operation spec;
    public Workshop(Operation oper) {
        setSpec(oper);
    }

    public Workshop() {

    }

    public void setSpec(Operation oper) {
        this.spec = oper;
    }

    public void operate() {
        spec.perform();
    }
}
