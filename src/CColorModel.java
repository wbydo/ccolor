import java.awt.Color;
import java.util.Observable;
import java.util.Observer;
class CColorModel extends Observable{

    Color presense;

    CColorModel(){
        this.presense = Color.black;
    }

    void changeColor(Color c){

        this.presense = c;
        this.setChanged();
        this.notifyObservers();
        System.out.println(c.toString());


    }
    Color getColor(){
        return this.presense;
    }
}
