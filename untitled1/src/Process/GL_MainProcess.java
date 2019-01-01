package Process;

import org.lwjgl.opengl.GL11;

/**
 * Where the main stuff for this program happens
 */
public class GL_MainProcess extends GL_BaseProcess {
    @Override
    protected WindowProperties gl_init(WindowProperties properties) {
        properties.width = 1000;
        properties.height = 1000;
        return properties;
    }

    @Override
    protected void gl_update() {
        GL11.glBegin(GL11.GL_LINE_STRIP);
        GL11.glColor3f((float)Math.random(), (float)Math.random(), (float)Math.random());
        GL11.glVertex2d(Math.random()*2 - 1, Math.random()*2 - 1);
        GL11.glVertex2d(Math.random()*2 - 1, Math.random()*2 - 1);
        GL11.glEnd();

    }
}
