public class Mainclass {

    private Object untitledField;

    public static void main(String[] args) {
        System.out.println("Creating Window...");
        Window w = Window.getInstance();
        System.out.println(w);
        
        System.out.println("Creating second Window...");
        Window w2 = Window.getInstance();
        System.out.println(w2);
        
        Label l = new Label("Teksti");
        w.addGUI(l);
        
        Frame f = new Frame("Valokuvakehys");
        w.addGUI(f);
        
        Toolbar t = new Toolbar("Palkki");
        w.addGUI(t);
        
        Button b = new Button("Ok");
        w.addGUI(b);
        
        w.draw();
    }
}
