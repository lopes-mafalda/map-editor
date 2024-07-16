package io.codeforall.flowribellas;

import io.codeforall.flowribellas.cursor.Key;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class KeyboardController implements KeyboardHandler {

    private Editor editor;

    public KeyboardController() {
        initKeyboard();
    }

    private void initKeyboard(){
        Keyboard keyboard = new Keyboard(this);
        Key.addAllKeyboardEvents(keyboard);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {


    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
