package Singleton;

public abstract class CarpetMakeDisplay {
    public abstract void displayMenu();

    public abstract void takeOrder();

    public abstract void makeCarpet();

    public final void getCarpet() {

        displayMenu();
        takeOrder();
        makeCarpet();
    }


}