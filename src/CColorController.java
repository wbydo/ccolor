import java.awt.event.*;
import java.awt.Color;


class CColorController implements MouseListener{
    CColorView view;
    CColorModel model;
    Color color;

    CColorController(CColorModel m, Color c){
        this.model = m;
        this.color = c;

    }

    public void mouseClicked(MouseEvent e){

    }
    public void mouseEntered(MouseEvent e){

    }
    public void mouseExited(MouseEvent e){

    }
    public void mousePressed(MouseEvent e){
        model.changeColor(this.color);


    }
    public void mouseReleased(MouseEvent e){

    }

}
