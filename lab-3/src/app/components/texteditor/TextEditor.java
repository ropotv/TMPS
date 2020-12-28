package app.components.texteditor;

public class TextEditor {
    private String state;

    public void writeText(String text) {
        this.state = text;
    }

    public Memento save() {
        return new Memento(state);
    }

    public void restore(Memento m) {
        state = m.getState();
    }

    public String getText() {
        return this.state;
    }
}