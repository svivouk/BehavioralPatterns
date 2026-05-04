package state;

public class BatState implements State{
    private final VampireSpecies vamp;

    public BatState(VampireSpecies vamp) {
        this.vamp = vamp;
    }


    @Override
    public void onEnterState() {
        System.out.println(vamp + " turns into a bat");
    }

    @Override
    public void AbilitiesDesc() {
        System.out.println(vamp + " gains bat abilities. They can fly!");
    }
}
