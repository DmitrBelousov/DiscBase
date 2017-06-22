package secondTry.SQL;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Entity
@Table (name="discs")
public class Disc {
    @Id
    @GeneratedValue
    private int id;

    @OneToMany(mappedBy = "disc")
    private List<Status> statuses;

    @Column(name = "Producer", columnDefinition = "enum('Merritor', 'SAF', 'Beral')")
    private Producer producer;

    public Disc(Producer producer,double weight,double thickness) {
        this.statuses = new LinkedList<Status>();
        statuses.add(new Status(State.New,Test.Boughted,weight,thickness));
        this.producer = producer;
    }

    public void addStatusUsed(Test test,double weight, double thickness) {
        statuses.add(new Status(State.Used,test,weight,thickness));
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

    public List<Status> getStatuses() {
        return statuses;
    }

    public Producer getProducer() {
        return producer;
    }
}
