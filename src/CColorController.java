import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;


class CColorController{
    CColorModel model;

    CColorController(CColorModel m){
        this.model = m;
    }

    MouseListener getOrangeController(){
        return this.buildMouseListener(Color.orange);
    }

    MouseListener getBlueController(){
        return this.buildMouseListener(Color.blue);
    }

    private MouseListener buildMouseListener(Color c){
        return new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e){
                model.changeColor(c);
            }
        };
    }
}
