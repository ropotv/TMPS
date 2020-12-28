package app.components.texteditor;

import java.util.ArrayList;

public class Caretaker {
    private final ArrayList<Memento> mementos = new ArrayList<>();

    public void addMemento(Memento m) {
        mementos.add(m);
    }

    public Memento getMemento() {
        return mementos.get(1);
    }
}