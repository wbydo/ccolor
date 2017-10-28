import java.awt.Color;

class CColor{
  public static void main(String[] args){
    CColorView v;
    CColorModel m;
    CColorController c;

    v = new CColorView();
    m = new CColorModel(v);



    CColorController ctrO = new CColorController(m, Color.orange);

    CColorController ctrB = new CColorController(m, Color.blue);

    v.addController(ctrO,ctrB);

    v.visible();
  }
}
