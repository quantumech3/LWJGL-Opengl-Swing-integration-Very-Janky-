package Application.Windows;

import Application.Components.DataIcon;

public class DataImageView extends BaseImageView{
    public DataImageView(int width, int height, String title, DataIcon icon) {
        super(width, height, title);
        this.dataIcon = icon;
        this.showImageAt(width, height, 0, 0);
    }

    public void setData(int[] data) {
        this.loadPixelsRGB(data);
        this.updateImage();
    }
}
