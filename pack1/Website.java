package pack1;

public class Website {
    String name;

    public Website(String name) {
        this.name = name;
    }

    public void show_web() {
        System.out.println("Website Name: " + name);
    }
}