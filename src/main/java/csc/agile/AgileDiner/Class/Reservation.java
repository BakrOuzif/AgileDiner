package csc.agile.AgileDiner.Class;


import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Table
@Entity
public class Reservation {
    @Id
    @SequenceGenerator(
        name = "resID",
        sequenceName = "resID",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "resID"
        )
    
    private long id ;
    private int party;
    private Date date;
    private String email;
    private String comment;
    private LocalDateTime time;

    public Reservation(int party, Date date, String email, LocalDateTime time, String comment) {
        this.party = party;
        this.date = date;
        this.email = email;
        this.time = time;
        this.comment = comment;
    }

}
 

