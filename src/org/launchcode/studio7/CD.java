package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc{

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    public CD(String type, int spin, double capacity, String read, String playBack) {
        super(type, spin, capacity, read, playBack);
    }

    @Override
    public void spinDisc() {
        System.out.println("A " + this.getType() + " spins at a rate of " + this.getSpin() + " - " + this.getSpin()*2.5 + " rpm.");
    }

    @Override
    public void readDisc() {
        System.out.println("A " + this.getRead() + " is used to read and write on a " + this.getType() + ".");
    }

    @Override
    public void tellCapacity() {
        System.out.println("A " + this.getType() + " has a storage capacity of " + this.getCapacity() + " MB.");
    }

    @Override
    public void tellType() {
        System.out.println("This is a " + this.getType() + ".");
    }

    @Override
    public void tellPlayBack() {
        System.out.println("A " + this.getType() + " can output " + this.getPlayBack() + ".");
    }

}
