package firstTry;

/**
 * Created by dima on 21.06.17.
 */
public class Disc {
    private static int icr; {icr=1;}
    private final int id;
    private final Status status;
    private double weight;
    private double tickness;

    public Disc(){
        this.id = icr++;
        this.status=new Status(id);
    }
}
