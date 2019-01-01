package GraphicsHandler;

import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;

import static org.lwjgl.glfw.GLFW.*;

public class GLDisplay {
    private int width, height;
    private long window;
    private boolean isStarted = false;

    public GLDisplay(int width, int height) {
        this.width = width;
        this.height = height;

        setupGLFW();
    }

    private void setupGLFW() {
        glfwInit();
        glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
        this.window = glfwCreateWindow(this.width, this.height, "", 0, 0);

    }

    public void start(boolean vSyncEnabled) {
        isStarted = true;
        glfwSwapInterval(vSyncEnabled ? 1 : 0);
        glfwMakeContextCurrent(this.window);
        GL.createCapabilities();
    }

    public void stop() {
        isStarted = false;
        glfwMakeContextCurrent(0);
    }

    public int[] getPixels() {
        if(!isStarted)
            throw new RuntimeException("You must start() GLDisplay before you can getPixels()!");

        int[] data = new int[this.width * this.height * 3];
        GL11.glReadPixels(0, 0, this.width, this.height, GL11.GL_RGB, GL11.GL_INT, data);

        data = processBuffer(data);

        return data;
    }

    private int[] processBuffer(int[] buffer) {

        int[] newBuffer = buffer;

        //The last bit of each int 23 bits away from the end bit for some reason
        //so this shifts all the data to the front of the int
        for(int i = 0; i < buffer.length; i++) {
            newBuffer[i] = buffer[i] >> 23;
        }

        //For some reason, OpenGL writes the pixels from the end back, so to ensure that each pixel
        //is in the correct position, the buffer gets reversed so the first pixel is at the first index
        int[] _newBuffer = newBuffer.clone();       //Make new copy of buffer, doing this for exactly the same reason that you would make a copy of an array to reverse it
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                setPixel(newBuffer, x, y, colorAtPixel(_newBuffer, x, height - y - 1));
            }
        }

        return newBuffer;
    }

    private int[] setPixel(int[] buffer, int x, int y, int[] rgbColor) {

        //This is the index of where the color starts (R component of RGB pixel)
        //at (x, y)
        int baseIndex = (y * this.width + x) * 3;

        //Set each color at the coordinate specified
        buffer[baseIndex] = rgbColor[0];
        buffer[baseIndex + 1] = rgbColor[1];
        buffer[baseIndex + 2] = rgbColor[2];

        return buffer;
    }

    /**
     * Used in processBuffer() to flip the frameBuffer since OpenGL reverses it
     * @param r Red component
     * @param g Green component
     * @param b Blue component
     * @return  int[] with values {r, g, b}
     */
    private int[] newColorArr(int r, int g, int b) {
        return new int[]{r, g, b};
    }

    private int[] colorAtPixel(int[] buffer, int x, int y) {
        //Base index of color at coordinate (x, y)
        int baseIndex = (y * this.width + x) * 3;

        //Make array with RGB components at coordinates specified
        return newColorArr(buffer[baseIndex], buffer[baseIndex + 1], buffer[baseIndex + 2]);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public long getWindow() {
        return this.window;
    }

    public void update() {
        if(!isStarted)
            throw new RuntimeException("You must start() GLDisplay before you can update()!");

        glfwSwapBuffers(window);
    }
}
