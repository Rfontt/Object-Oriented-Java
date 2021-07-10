package br.com.bytebank.javaUtil;

import br.com.bytebank.exceptions.Account;

public class ReferenceKeeper {
    private Account[] references;
    private int positionFree;

    public ReferenceKeeper() {
        this.references = new Account[10];
        positionFree = 0;
    }

    public void add(Account reference) {
        this.references[positionFree] = reference;
        this.positionFree++;
    }

    public int getNumberOfElements() {
        return this.positionFree;
    }

    public Account getReference(int position) {
        try {
            return this.references[position];
        }catch (ArrayIndexOutOfBoundsException exception) {
            throw new ReferenceException("Position without reference");
        }
    }
}
