package templatemethod;

public class CreativeServer extends MinecraftServer{
    @Override
    protected void loadMods() {
        System.out.println("Loading 95 mods: \n a lot of mods from survival but with World edit, Axiom and something");

    }

    @Override
    protected void loadWorld() {
        System.out.println("Loading creative world");
    }
    @Override
    protected void onServerStarted(){
        System.out.println("Omg it's like Hermitcraft");
    }
}
