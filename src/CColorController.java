import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;


class CColorController extends MouseAdapter{
    CColorView view;
    CColorModel model;
    Color color;

    CColorController(CColorModel m, Color c){
        this.model = m;
        this.color = c;

    }

    public void mousePressed(MouseEvent e){
        model.changeColor(this.color);
    }
}
