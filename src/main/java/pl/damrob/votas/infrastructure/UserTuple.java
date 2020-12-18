package pl.damrob.votas.infrastructure;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserTuple {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    String name;
    String password;
}
