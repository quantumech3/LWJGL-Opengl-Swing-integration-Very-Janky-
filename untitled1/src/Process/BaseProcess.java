package Process;

public abstract class BaseProcess {
    private boolean shouldExit = false;

    public BaseProcess() {
        init();
        while(!shouldExit) {
            update();
        }

    }

    protected abstract void init();
    protected abstract void update();
    protected void exit() {
        shouldExit = true;
    }
}
