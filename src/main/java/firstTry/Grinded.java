package firstTry;

import java.util.Date;

/**
 * Created by dima on 21.06.17.
 */
public class Grinded {
    private final Date date;
    private final double weight;
    private final double thickness;

    public Grinded(double weight, double thickness) {
        date = new Date();
        this.weight = weight;
        this.thickness = thickness;
    }
}
