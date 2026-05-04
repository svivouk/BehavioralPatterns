package templatemethod;

public class MainServer extends MinecraftServer{
    @Override
    protected void loadMods() {
        System.out.println("Loading 91 mods: \n a lot of mods for great survival exp");
    }

    @Override
    protected void loadWorld() {
        System.out.println("Loading beautiful and gorg survival world");
    }
}
