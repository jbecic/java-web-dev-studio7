package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD myCD = new CD("CD", 200, 700, "laser", "sound");
        DVD myDVD = new DVD("DVD", 570, 4.7, "laser", "video and audio");

        // TODO: Call each CD and DVD method to verify that they work as expected.
        myCD.tellType();
        myCD.readDisc();
        myCD.spinDisc();
        myCD.tellCapacity();
        myCD.tellPlayBack();

        myDVD.tellType();
        myDVD.readDisc();
        myDVD.spinDisc();
        myDVD.tellCapacity();
        myDVD.tellPlayBack();

    }
}
