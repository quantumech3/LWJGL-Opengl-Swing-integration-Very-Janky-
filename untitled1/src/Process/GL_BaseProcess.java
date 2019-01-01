package Process;

import Application.Windows.GLView;

public abstract class GL_BaseProcess extends BaseProcess {

    GLView view;



    @Override
    protected void init() {
        WindowProperties properties = new WindowProperties();

        properties = gl_init(properties);
        view = new GLView(properties.width, properties.height, properties.title, properties.vSync);
        view.show();
    }

    @Override
    protected void update() {
        gl_update();
        view.update();  //Do stuff along the lines of swapping frame buffers, updating the JPanel that is showing the image, etc..
    }

    protected abstract WindowProperties gl_init(WindowProperties properties);

    protected abstract void gl_update();
}
