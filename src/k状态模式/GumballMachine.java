package k状态模式;

public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State winnerState;

    State state = soldOutState;
    int count = 0;

    public void insertQuarter() {
        this.state.insertQuarter();
    };
    public void turnCrank() {
        this.state.turnCrank();
    }
    public void ejectQuarter() {
        this.state.ejectQuarter();
    }
    public void dispense() {
        this.state.dispense();
    }

    public int getCount() {
        return count;
    }

    public void releaseBall() {}

    public void setState(State state) {
        this.state = state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getWinnerState() {
        return winnerState;
    }
}
