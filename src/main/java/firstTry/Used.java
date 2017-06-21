package firstTry;

import java.util.Date;

/**
 * Created by dima on 21.06.17.
 */
public class Used {
    private final Date date;
    private final double weight;
    private final double thickness;
    private final Test test;

    public Used(double weight, double thickness, int test) {
        this.date = new Date();
        this.weight = weight;
        this.thickness = thickness;
        switch (test) {
            case 1: {
                this.test = Test.MB002_Performance_Test;
                break;
            }
            case 2: {
                this.test = Test.MB003_R90;
                break;
            }
            case 3: {
                this.test = Test.MB011_Wear_Test;
                break;
            }
            default:
                throw new IllegalArgumentException("Argument should be 1 or 2 or 3");
        }
    }
}
