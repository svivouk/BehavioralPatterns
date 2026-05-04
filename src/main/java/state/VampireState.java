package state;

public class VampireState implements State{

    private final VampireSpecies vamp;

    public VampireState(VampireSpecies vamp) {
        this.vamp = vamp;
    }

    @Override
    public void onEnterState() {
        System.out.println(vamp + " in its original form. Congrats!");
    }

    @Override
    public void AbilitiesDesc() {
        System.out.println(vamp + " now can do whatever he can idk.");
    }
}
