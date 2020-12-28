package app;

import app.components.texteditor.Logger;
import app.components.texteditor.TextEditor;

public class Main {

    public static void main(String[] args) {
        Logger logger = new Logger();
        TextEditor textEditor = new TextEditor();
        textEditor.writeText("Here is first sentence");
        textEditor.writeText("Now we add another text and will hit save");
        logger.addMemento(textEditor.save());
        textEditor.writeText("Hit save again");
        logger.addMemento(textEditor.save());
        textEditor.writeText("Something wrong typed in and I will restore it");
        textEditor.restore(logger.getMemento());

        System.out.println(textEditor.getText());
    }
}
