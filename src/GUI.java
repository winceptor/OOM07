public abstract class GUI {

    private final String cName;
    
    public GUI() {
        cName = "Unnamed";
    }
    
    public GUI(String name) {
        cName = name;
    }

    public void draw() {
        System.out.println("Drawing GUI component: " + this.getClass() + "(" + this.cName + ")");
    }
}
