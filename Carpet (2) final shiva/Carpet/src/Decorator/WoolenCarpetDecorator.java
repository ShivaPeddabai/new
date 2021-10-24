package Decorator;
import Singleton.*;

public class WoolenCarpetDecorator extends CarpetDecorator{
    private Carpet t;

    public WoolenCarpetDecorator(Carpet t){
        this.t=t;
    }



    @Override
    public String makeCarpet() {
        return t.makeCarpet()+" ,woolen";
    }
}
