package mx.petcare.mascotas.petcareAPI.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PetDTO {
    private Integer petid;
    private Integer userid;;
    private String petname;
    private String race;
    private String species;
    private String petimage;

    public PetDTO() {}

   

    public PetDTO(Integer petid, Integer userid, String petname, String race, String species, String petimage) {
        this.petid = petid;
        this.userid = userid;
        this.petname = petname;
        this.race = race;
        this.species = species;
        this.petimage = petimage;
    }

    

   
}