package com.library.view;

import javax.swing.*;
import java.awt.*;

public class IScrollPane extends JScrollPane {
    public IScrollPane() {
        super();
        this.setHorizontalScrollBarPolicy(IScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        this.setVerticalScrollBarPolicy(IScrollPane.VERTICAL_SCROLLBAR_NEVER);
        this.setBorder(null);
        this.setOpaque(true);
        this.getViewport().setOpaque(true);
    }

    public IScrollPane(Component view, int vsbPolicy, int hsbPolicy) {
        super(view, vsbPolicy, hsbPolicy);
        this.setHorizontalScrollBarPolicy(IScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        this.setVerticalScrollBarPolicy(IScrollPane.VERTICAL_SCROLLBAR_NEVER);
        this.setBorder(null);
        this.setOpaque(true);
        this.getViewport().setOpaque(true);
    }

    public IScrollPane(Component view) {
        super(view);
        this.setHorizontalScrollBarPolicy(IScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        this.setVerticalScrollBarPolicy(IScrollPane.VERTICAL_SCROLLBAR_NEVER);
        this.setBorder(null);
        this.setOpaque(true);
        this.getViewport().setOpaque(true);
    }

    public IScrollPane(int vsbPolicy, int hsbPolicy) {
        super(vsbPolicy, hsbPolicy);
        this.setHorizontalScrollBarPolicy(IScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        this.setVerticalScrollBarPolicy(IScrollPane.VERTICAL_SCROLLBAR_NEVER);
        this.setBorder(null);
        this.setOpaque(true);
        this.getViewport().setOpaque(true);
    }

}
