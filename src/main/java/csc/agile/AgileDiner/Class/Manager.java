package csc.agile.AgileDiner.Class;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table
@Entity
@NoArgsConstructor
public class Manager {

    @Id
    @SequenceGenerator(
        name = "manID",
        sequenceName = "manID",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "manID"
        )
    
    private long id ;
    private String uname;
    private String pwd;


    public Manager(String uname, String pwd) {
        this.uname = uname;
        this.pwd = pwd;
    }    
}
