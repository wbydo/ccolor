import java.awt.Color;

class CColor{
    public static void main(String[] args){
        CColorView view;
        CColorModel model;
        CColorController ctr;

        model = new CColorModel();
        view = new CColorView(model);
        model.addObserver(view);

        ctr = new CColorController(model);
        view.addController(ctr);

        view.visible();
    }
}
