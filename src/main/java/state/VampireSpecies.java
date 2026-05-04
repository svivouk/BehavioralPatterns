package state;

public class VampireSpecies {
    private State state;

    public VampireSpecies() {
        state = new VampireState(this);
    }

    @Override
    public String toString() {
        return "A vampire";
    }

    public void hiding() {
        if (state.getClass().equals(VampireState.class)) {
            changeStateTo(new DisguisedState(this));
        } else if(state.getClass().equals(DisguisedState.class)) {
            changeStateTo(new VampireState(this));
            changeStateTo(new BatState((this)));
        }
        else{
            changeStateTo(new BatState((this)));
        }
    }

    public void night(){
        if (state.getClass().equals(VampireState.class)) {
            changeStateTo(new DisguisedState(this));
        } else if(state.getClass().equals(DisguisedState.class)) {
            changeStateTo(new VampireState(this));
        }
        else{
            changeStateTo(new VampireState(this));

        }
    }

    public void Abilities(){
        this.state.AbilitiesDesc();
    }
    private void changeStateTo(State newState) {
        this.state = newState;
        this.state.onEnterState();

    }
}