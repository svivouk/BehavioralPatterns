package state;

public class DisguisedState implements State{
    private final VampireSpecies vamp;

    public DisguisedState(VampireSpecies vamp) {
        this.vamp = vamp;
    }

    @Override
    public void onEnterState() {
        System.out.println(vamp + " is disguised as human yay!");
    }

    @Override
    public void AbilitiesDesc() {
        System.out.println(vamp + " now a lil bit helpless bcs he is a loser");
    }
}
