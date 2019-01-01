package Application.Windows;

import Application.Components.DataIcon;
import GraphicsHandler.GLDisplay;

public abstract class BaseGLView extends BaseImageView{
    protected GLDisplay display;

    public BaseGLView(int width, int height, String title, boolean vSync) {
        super(width, height, title);

        this.jframe.setResizable(false);

        this.display = new GLDisplay(width, height);
        this.display.start(vSync);
        this.dataIcon = new DataIcon(width, height);
        this.showImageAt(width, height, 0, 0);
    }

    public void update() {
        render();
        this.loadPixelsRGB(this.display.getPixels());
        this.display.update();
        this.updateImage();
    }

    protected abstract void render();
}
