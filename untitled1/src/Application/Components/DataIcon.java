package Application.Components;

import javax.swing.*;
import java.awt.*;

public class DataIcon implements Icon {
    int width, height;
    DataImage image;

    public DataIcon(int width, int height) {
        this.width = width;
        this.height = height;
        image = new DataImage(this.width, this.height, DataImage.TYPE_INT_RGB);
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.drawImage(image, 0, 0, null);
    }

    @Override
    public int getIconWidth() {
        return width;
    }

    @Override
    public int getIconHeight() {
        return height;
    }

    public void setData(int[] data) {
        image.setData(data);
    }
}
