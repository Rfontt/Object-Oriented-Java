package br.com.bytebank.enums;

public enum Priority {
    MIN(1), NORMAL(5), MAX(10);

    private int value;

    Priority(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
