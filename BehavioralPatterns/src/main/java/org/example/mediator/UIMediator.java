package org.example.mediator;

import java.util.ArrayList;
import java.util.List;

//Mediator
public class UIMediator {

    List<UIControl> controls = new ArrayList<>();

    public void register(UIControl control) {
        controls.add(control);
    }

    public void valueChanged(UIControl control) {
        controls.stream().filter(c -> c != control).forEach(c -> c.controlChanged(control));
    }

}
