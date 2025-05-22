package P11;

public class Vertex {
    
    private char label;
    private boolean wasVisited;

    public Vertex(char lab) {
        label = lab;
        wasVisited = false;
    }

    public void setLabel(char label) {
        this.label = label;
    }

    public char getLabel() {
        return label;
    }

    public void setWasVisited(boolean wasVisited) {
        this.wasVisited = wasVisited;
    }

    public char getWasvisited() {
        return label;
    }

}
