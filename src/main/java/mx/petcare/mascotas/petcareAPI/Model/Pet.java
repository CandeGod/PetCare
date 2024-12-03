package mx.petcare.mascotas.petcareAPI.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Pet")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer petId;

    @ManyToOne
    @JoinColumn(name = "userid", nullable = false) // Indicar que no puede ser nulo
    private User user;

    private String petname;
    private String race;
    private String species;
    private String petimage;

    // Constructor sin argumentos (necesario para JPA)
    public Pet() {
    }

    public Pet(Integer petId) {
        this.petId = petId;
    }


    @Override
    public String toString() {
        return "Pet [petId=" + petId + ", user=" + user + ", petname=" + petname + ", race=" + race + ", species="
                + species + ", petimage=" + petimage + "]";
    }

    // Constructor para crear un objeto Pet con User
    public Pet(User user, String petname, String race, String species, String petimage) {
        this.user = user;
        this.petname = petname;
        this.race = race;
        this.species = species;
        this.petimage = petimage;
    }

    // Constructor que incluye petId, en caso de que necesites actualizar un Pet
    public Pet(Integer petId, User user, String petname, String race, String species, String petimage) {
        this.petId = petId;
        this.user = user;
        this.petname = petname;
        this.race = race;
        this.species = species;
        this.petimage = petimage;
    }

    // Constructor sobrecargado que acepta solo algunos parámetros
    public Pet(User user, String petname, String race, String species) {
        this.user = user;
        this.petname = petname;
        this.race = race;
        this.species = species;
        this.petimage = null; // o alguna imagen por defecto
    }

    
}
