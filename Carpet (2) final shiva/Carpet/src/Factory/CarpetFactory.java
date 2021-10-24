package Factory;
import Singleton.*;
public class CarpetFactory {
    public Carpet getCarpet(String carpetType){
        if(carpetType == null){
            return null;
        }
        if(carpetType.equalsIgnoreCase("Red")){
            return new RedCarpet();

        } else if(carpetType.equalsIgnoreCase("Green")){
            return new GreenCarpet();

        } else if(carpetType.equalsIgnoreCase("Purple")){
            return new PurpleCarpet();
        }
        else if(carpetType.equalsIgnoreCase("White")){
            return new WhiteCarpet();
        }
        return null;
    }
}

