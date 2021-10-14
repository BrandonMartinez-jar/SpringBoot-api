package co.com.springbootexercise.everis.models;

import javax.persistence.*;

@Entity
@Table(name = "COB_GESTOR", schema = "GCCOBRANZAS")
public class ManagerModel {

    @Id
    @Column(name = "USUARIO_ID", unique = true, nullable = false)
    private String id;

    @Column(name = "PRIMER_NOMBRE", nullable = false)
    private String firstName;

    @Column(name = "SEGUNDO_NOMBRE", nullable = true)
    private String secondName;

    @Column(name = "PRIMER_APELLIDO", nullable = false)
    private String firstLastName;

    @Column(name = "SEGUNDO_APELLIDO", nullable = true)
    private String SecondLastName;

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getFirstLastName() {
        return firstLastName;
    }

    public String getSecondLastName() {
        return SecondLastName;
    }
}
