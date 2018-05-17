#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@SequenceGenerator(name = "person_seq", sequenceName = "person_seq")
public class Person implements Serializable {

    @Id
    @GeneratedValue(generator = "person_seq", strategy = GenerationType.SEQUENCE)
    private int id;
    @NotNull
    @Column(unique = true)
    private String email;
    @NotNull
    @Size(min = 10, max = 70)
    private String name;


    public Person() {
    }

    public Person(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
