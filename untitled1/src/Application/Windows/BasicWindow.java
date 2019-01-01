package Application.Windows;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BasicWindow {
    protected JFrame jframe;
    private int width;
    private int height;

    public BasicWindow(int width, int height, String title) {
        this.width = width;
        this.height = height;

        jframe = new JFrame(title);
        jframe.setSize(width, height);
        jframe.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                onExit();
                super.windowClosing(e);
            }
        });
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getTitle() {
        return jframe.getTitle();
    }

    public void setTitle(String title) {
        jframe.setTitle(title);
    }

    public void show() {
        jframe.setVisible(true);
    }

    public void hide() {
        jframe.setVisible(false);
    }

    protected void addComponent(Component component) {
        jframe.add(component);
    }

    protected void onExit() {};
}
