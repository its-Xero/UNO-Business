package com.library.view;

import javax.swing.*;
import java.awt.*;

public class IScrollPane extends JScrollPane {
    public IScrollPane() {
        super();
    }

    public IScrollPane(Component view, int vsbPolicy, int hsbPolicy) {
        super(view, vsbPolicy, hsbPolicy);
    }

    public IScrollPane(Component view) {
        super(view);
    }

    public IScrollPane(int vsbPolicy, int hsbPolicy) {
        super(vsbPolicy, hsbPolicy);
    }

}
