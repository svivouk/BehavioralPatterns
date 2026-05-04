package strategy;

public class Player {
    private PvPStrategy strategy;
    public Player(PvPStrategy strategy){
        this.strategy = strategy;
    }
    public void setStrategy(PvPStrategy strategy){
        this.strategy = strategy;

    }
    public void duel(){
        this.strategy.execute();
    }
}
