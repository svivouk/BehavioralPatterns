package templatemethod;

import com.sun.tools.javac.Main;

public class Admin {
    private MinecraftServer mainServer;
    public Admin(MinecraftServer mainServer){
        this.mainServer = mainServer;
    }

    public void start(){
        mainServer.start();
    }

    public void changeServer(MinecraftServer mainServer){
        this.mainServer = mainServer;
    }

}
