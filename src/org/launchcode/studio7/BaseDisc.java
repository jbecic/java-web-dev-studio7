package org.launchcode.studio7;

public abstract class BaseDisc {
    private String type;
    private int spin;
    private double capacity;
    private String read;
    private String playBack;

    public BaseDisc(String aType, int aSpin, double aCapacity, String aRead, String aPlayBack) {
        type = aType;
        spin = aSpin;
        capacity = aCapacity;
        read = aRead;
        playBack = aPlayBack;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSpin() {
        return spin;
    }

    public void setSpin(int spin) {
        this.spin = spin;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getRead() {
        return read;
    }

    public void setRead(String read) {
        this.read = read;
    }

    public String getPlayBack() {
        return playBack;
    }

    public void setPlayBack(String playBack) {
        this.playBack = playBack;
    }
}
