import java.awt.Container;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.FlowLayout;

import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JButton;

import java.util.*;

class CColorView implements Observer{
    JFrame frame;
    Container container;

    JPanel colorPanel;
    JPanel buttonPanel;

    JButton button_orange;
    JButton button_blue;

    CColorView(CColorModel model){
        frame = new JFrame("てすと");
        frame.setSize(400, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        container = frame.getContentPane();
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));

        colorPanel = new JPanel();
        colorPanel.setPreferredSize(new Dimension(400, 400));
        colorPanel.setMaximumSize(new Dimension(400, 400));

        colorPanel.setBackground(model.getColor());
        container.add(colorPanel);

        buttonPanel = new JPanel();
        buttonPanel.setPreferredSize(new Dimension(400, 200));
        buttonPanel.setMaximumSize(new Dimension(400, 200));
        container.add(buttonPanel);

        buttonPanel.setLayout(new FlowLayout());





        button_orange = new JButton("おれんじ");
        buttonPanel.add(button_orange);


        button_blue = new JButton("あお");
        buttonPanel.add(button_blue);


    }

    void visible(){
        frame.setVisible(true);
    }

    void changeColor(Color c){
        colorPanel.setBackground(c);
        frame.repaint();
    }
    public void update(Observable o, Object arg){
        Color c;
        CColorModel m = (CColorModel) o;
        c = m.getColor();

        this.changeColor(c);
    }

    void addController(CColorController ctr){
        MouseListener OrangeCtr = ctr.getOrangeController();
        MouseListener BlueCtr = ctr.getBlueController();

        button_orange.addMouseListener(OrangeCtr);
        button_blue.addMouseListener(BlueCtr);
    }

}
