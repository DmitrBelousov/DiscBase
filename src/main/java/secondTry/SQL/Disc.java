package secondTry.SQL;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name="discs")
public class Disc {
    @Id
    @GeneratedValue
    private int id;

    @OneToMany(mappedBy = "disc")
    @JoinColumn(name="Status_id")
    private List<Status> statuses;

    @Column(name = "Producer", columnDefinition = "enum('Merritor', 'SAF', 'Beral')")
    private Producer producer;

    public List<Status> getStatuses() {
        return statuses;
    }

    public Producer getProducer() {
        return producer;
    }
}
