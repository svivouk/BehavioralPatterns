package templatemethod;

public abstract class MinecraftServer {
    public final void start() {
        initializeHardware();
        loadMods();
        loadWorld();
        authenticateUsers();
        onServerStarted();
    }

    private void initializeHardware() {
        System.out.println("Allocating RAM and initializing CPU cores...");
    }

    protected abstract void loadMods();
    protected abstract void loadWorld();

    protected void authenticateUsers() {
        System.out.println("Standard Mojang authentication enabled.");
    }
    protected void onServerStarted() {}
}

