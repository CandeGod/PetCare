package mx.petcare.mascotas.petcareAPI.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PetDTO {
    private Integer petId;
    private Integer userId;;
    private String petName;
    private String race;
    private String species;
    private String petImage;

    public PetDTO() {}

    public PetDTO(Integer petId, Integer userId, String petName, String race, String species, String petImage) {
        this.petId = petId;
        this.userId = userId;
        this.petName = petName;
        this.race = race;
        this.species = species;
        this.petImage = petImage;
    }

   
}