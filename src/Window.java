
import java.util.ArrayList;

public class Window {

    private static Window instance;
    
    private static ArrayList<GUI> components;

    private Window() {
    }

    public static Window getInstance() {
        if (instance == null) {
            instance = new Window();
            System.out.println("New Window created!");
        }
        components = new ArrayList();
        return instance;
    }



    public void addGUI(GUI component) {
        components.add(component);
    }

    public void draw() {
        for (int i = 0; i < Window.components.size(); i++) {
            Window.components.get(i).draw();
        }
    }
}
