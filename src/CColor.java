import java.awt.Color;

class CColor{
  public static void main(String[] args){
    CColorView view;
    CColorModel model;
    CColorController c;

    model = new CColorModel();
    view = new CColorView();
    model.addObserver(view);



    CColorController ctrO = new CColorController(model, Color.orange);

    CColorController ctrB = new CColorController(model, Color.blue);

    view.addController(ctrO,ctrB);

    view.visible();
  }
}
