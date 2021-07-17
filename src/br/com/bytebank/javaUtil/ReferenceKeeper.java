package br.com.bytebank.javaUtil;

public class ReferenceKeeper {
    private Object[] references;
    private int positionFree;

    public ReferenceKeeper() {
        this.references = new Object[10];
        positionFree = 0;
    }

    public void addReference(Object reference) {
        this.references[positionFree] = reference;
        this.positionFree++;
    }

    public int getNumberOfElements() {
        return this.positionFree;
    }

    public Object getReference(int position) {
        try {
            return this.references[position];
        }catch (ArrayIndexOutOfBoundsException exception) {
            throw new ReferenceException("Position without reference");
        }
    }
}
