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
    @JoinColumn(name = "disc_id")
    private Disc disc;
    @Column(columnDefinition = "enum('Grinded','Used','New','Wasted')")
    private State state;
    @Column(columnDefinition = "enum('Boughted','Grinded','MB002_Performance_Test','MB003_R90','MB011_Wear_Test')")
    private Test test;
    private Double weight;
    private Double thickness;
    private Date date;
    private String testNumber =null;

    public Status(State state, Test test, Double weight, Double thickness) {
        this.state = state;
        this.test = test;
        this.weight = weight;
        this.thickness = thickness;
//        this.date = new Date();
    }

    public Status(State state, Test test, String testNumber, Double weight, Double thickness) {
        this.state = state;
        this.test = test;
        this.testNumber = testNumber;
        this.weight = weight;
        this.thickness = thickness;
//        this.date = new Date();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDisc(Disc disc) {
        this.disc = disc;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void setThickness(Double thickness) {
        this.thickness = thickness;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public Disc getDisc() {
        return disc;
    }

    public State getState() {
        return state;
    }

    public Test getTest() {
        return test;
    }

    public Double getWeight() {
        return weight;
    }

    public Double getThickness() {
        return thickness;
    }

    public Date getDate() {
        return date;
    }

    public String getTestNumber() {
        return testNumber;
    }

    public void setTestNumber(String testNumber) {
        this.testNumber = testNumber;
    }
}
