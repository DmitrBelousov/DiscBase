package secondTry.SQL;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Entity
@Table(name = "discs")
public class Disc {
    @Id
    @GeneratedValue
    private int id;
    private String identificator;
    @Column(columnDefinition = "enum('D22', 'D19', 'D17')")
    private DiscType discType;


    @OneToMany(mappedBy = "disc")
    private List<Status> statuses;

    @Column(name = "Producer", columnDefinition = "enum('Merritor', 'SAF', 'Beral')")
    private Producer producer;

    public Disc(DiscType discType, String identificator, Producer producer, double weight, double thickness) {
        this.discType = discType;
        this.identificator = identificator;
        this.statuses = new LinkedList<Status>();
        statuses.add(new Status(State.New, Test.Boughted, weight, thickness));
        this.producer = producer;
    }

    public void addStatusUsed(Test test, double weight, double thickness) {
        statuses.add(new Status(State.Used, test, weight, thickness));
    }

    public void addStatusGrinded(double weight, double thickness) {
        statuses.add(new Status(State.Grinded, Test.Grinded, weight, thickness));
    }

    public void setIdentificator(String identificator) {
        this.identificator = identificator;
    }

    public void setDiscType(DiscType discType) {
        this.discType = discType;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStatuses(List<Status> statuses) {
        this.statuses = statuses;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public int getId() {

        return id;
    }

    public String getIdentificator() {
        return identificator;
    }

    public DiscType getDiscType() {
        return discType;
    }

    public List<Status> getStatuses() {
        return statuses;
    }

    public Producer getProducer() {
        return producer;
    }
}
