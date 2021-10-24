package Decorator;
import Singleton.*;

public class SilkCarpetDecorator extends CarpetDecorator{
    private final Carpet t;

    public SilkCarpetDecorator(Carpet t){
        this.t=t;
    }



    @Override
    public String makeCarpet() {
        return t.makeCarpet()+" ,Silk";
    }
}
