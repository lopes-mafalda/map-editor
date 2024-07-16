package io.codeforall.flowribellas.cursor;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;

public enum Key {

    PRESS_SPACE(KeyboardEvent.KEY_SPACE, KeyboardEventType.KEY_PRESSED),
    RELEASE_SPACE(KeyboardEvent.KEY_SPACE, KeyboardEventType.KEY_RELEASED),
    PRESS_UP(KeyboardEvent.KEY_UP, KeyboardEventType.KEY_PRESSED),
    PRESS_DOWN(KeyboardEvent.KEY_DOWN, KeyboardEventType.KEY_PRESSED),
    PRESS_RIGHT(KeyboardEvent.KEY_RIGHT, KeyboardEventType.KEY_PRESSED),
    PRESS_LEFT(KeyboardEvent.KEY_LEFT, KeyboardEventType.KEY_PRESSED),
    PRESS_C(KeyboardEvent.KEY_C, KeyboardEventType.KEY_PRESSED),
    PRESS_S(KeyboardEvent.KEY_S, KeyboardEventType.KEY_PRESSED),
    PRESS_L(KeyboardEvent.KEY_L, KeyboardEventType.KEY_PRESSED),
    PRESS_0(KeyboardEvent.KEY_0, KeyboardEventType.KEY_PRESSED),
    PRESS_1(KeyboardEvent.KEY_1, KeyboardEventType.KEY_PRESSED),
    PRESS_2(KeyboardEvent.KEY_2, KeyboardEventType.KEY_PRESSED),
    PRESS_3(KeyboardEvent.KEY_3, KeyboardEventType.KEY_PRESSED),
    PRESS_4(KeyboardEvent.KEY_4, KeyboardEventType.KEY_PRESSED),
    PRESS_5(KeyboardEvent.KEY_5, KeyboardEventType.KEY_PRESSED),
    PRESS_6(KeyboardEvent.KEY_6, KeyboardEventType.KEY_PRESSED),
    PRESS_7(KeyboardEvent.KEY_7, KeyboardEventType.KEY_PRESSED),
    PRESS_8(KeyboardEvent.KEY_8, KeyboardEventType.KEY_PRESSED),
    PRESS_9(KeyboardEvent.KEY_9, KeyboardEventType.KEY_PRESSED),
    PRESS_N(KeyboardEvent.KEY_N, KeyboardEventType.KEY_PRESSED);


    private int key;
    private KeyboardEventType type;

    Key(int key, KeyboardEventType type) {
        this.key = key;
        this.type = type;
    }

    private void addKeyboardEvent(Keyboard keyboard) {
        KeyboardEvent keyboardEvent = new KeyboardEvent();
        keyboardEvent.setKey(key);
        keyboardEvent.setKeyboardEventType(type);

        keyboard.addEventListener(keyboardEvent);
    }

    public static void addAllKeyboardEvents(Keyboard keyboard) {
        for (Key key : Key.values()) {
            key.addKeyboardEvent(keyboard);
        }
    }
}
