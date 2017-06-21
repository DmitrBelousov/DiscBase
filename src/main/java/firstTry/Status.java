package firstTry;

/**
 * Created by dima on 21.06.17.
 */
public class Status {
    private StatusState state;
    private final int disc;
    private final StatusList list = new StatusList();

    public Status(int disc) {
        this.disc = disc;
        this.state = StatusState.New;
    }

    public void setGrined() {

    }
}
