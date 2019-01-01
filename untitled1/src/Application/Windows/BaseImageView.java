package Application.Windows;

import Application.Components.DataIcon;

import javax.swing.*;

public abstract class BaseImageView extends BasicWindow{

    protected DataIcon dataIcon;
    protected JLabel imageLabel;

    public BaseImageView(int width, int height, String title) {
        super(width, height, title);
    }

    protected void showImageAt(int width, int height, int x, int y) {
        this.imageLabel = new JLabel(this.dataIcon);
        this.imageLabel.setSize(width, height);
        this.imageLabel.setLocation(x, y);
        this.jframe.add(imageLabel);
    }

    protected void loadPixelsRGB(int[] pixels) {
        this.dataIcon.setData(pixels);
    }

    protected void updateImage() {
        this.imageLabel.repaint();
    }
}
