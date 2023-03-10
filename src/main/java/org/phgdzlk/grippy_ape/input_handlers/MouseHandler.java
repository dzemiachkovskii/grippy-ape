package org.phgdzlk.grippy_ape.input_handlers;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseHandler implements MouseListener, MouseMotionListener {
    public Point coordinates = new Point();
    public boolean isClicked, leftButton;

    @Override
    public void mouseMoved(MouseEvent e) {
        coordinates.setLocation(e.getX(), e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        int button = leftButton ? MouseEvent.BUTTON1 : MouseEvent.BUTTON3;
        if (e.getButton() == button) {
            isClicked = true;
        }
    }

    public void switchButton() {
        leftButton = !leftButton;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }
}
