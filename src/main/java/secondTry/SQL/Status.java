package secondTry.SQL;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Status {
    @Id
    @GeneratedValue
    private int id;
    @ManyToOne
    private Disc disc;
    @Column(columnDefinition = "enum('Grinded','Used','New','Wasted')")
    private State state;
    @Column(columnDefinition = "enum('Boughted','Grinded','MB002_Performance_Test','MB003_R90','MB011_Wear_Test')")
    private Test test;
    private double weight;
    private double thickness;
    private Date date;

    public Disc getDisc() {
        return disc;
    }

    public State getState() {
        return state;
    }

    public Test getTest() {
        return test;
    }

    public double getWeight() {
        return weight;
    }

    public double getThickness() {
        return thickness;
    }

    public Date getDate() {
        return date;
    }

}
