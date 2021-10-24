package Decorator;

import Singleton.Carpet;

public class NylonCarpetDecorator extends CarpetDecorator {
    private Carpet t;

    public NylonCarpetDecorator(Carpet t) {
        this.t = t;
    }

    public String makeCarpet() {
        return this.t.makeCarpet() + " ,woolen";
    }
}
