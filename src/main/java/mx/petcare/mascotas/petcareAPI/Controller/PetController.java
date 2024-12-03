package mx.petcare.mascotas.petcareAPI.Controller;

import mx.petcare.mascotas.petcareAPI.Model.Pet;
import mx.petcare.mascotas.petcareAPI.Model.User;
import mx.petcare.mascotas.petcareAPI.Service.PetService;
import mx.petcare.mascotas.petcareAPI.Service.UserService;
import mx.petcare.mascotas.petcareAPI.dto.PetDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class PetController {

    @Autowired
    private PetService service;

    @Autowired
    private UserService userService;

    @QueryMapping
    public List<Pet> getAllPets() {
        return service.getAll();
    }

    @QueryMapping
    public Pet getPetById(@Argument Integer petId) {
        return service.getByidPet(petId);
    }

    @MutationMapping
public Pet createPet(@Argument(value = "pet") PetDTO petDTO) {
    if (petDTO == null || petDTO.getPetName() == null || petDTO.getRace() == null || petDTO.getSpecies() == null || petDTO.getUserId() == null) {
        throw new IllegalArgumentException("Pet details cannot be null or empty");
    }
    
    Pet pet = new Pet();
    pet.setPetname(petDTO.getPetName());
    pet.setRace(petDTO.getRace());
    pet.setSpecies(petDTO.getSpecies());
    pet.setPetimage(petDTO.getPetImage());
    
    // Aquí necesitas buscar el usuario por su userId y establecerlo en la mascota
    User user = userService.findById(petDTO.getUserId()); // Asegúrate de tener un UserService para esto
    if (user == null) {
        throw new IllegalArgumentException("User not found");
    }
    pet.setUser(user);  // Asocia la mascota con el usuario

    return service.save(pet);
}

@MutationMapping
public Pet updatePet(@Argument(value = "petId") Integer petId, @Argument(value = "pet") PetDTO petDTO) {
    Pet pet = service.findById(petId);
    if (pet == null) {
        throw new IllegalArgumentException("Pet not found");
    }

    if (petDTO.getPetName() != null) {
        pet.setPetname(petDTO.getPetName());
    }
    if (petDTO.getRace() != null) {
        pet.setRace(petDTO.getRace());
    }
    if (petDTO.getSpecies() != null) {
        pet.setSpecies(petDTO.getSpecies());
    }
    if (petDTO.getPetImage() != null) {
        pet.setPetimage(petDTO.getPetImage());
    }
    
    // Actualiza el usuario asociado si se proporciona userId
    if (petDTO.getUserId() != null) {
        User user = userService.findById(petDTO.getUserId());
        if (user == null) {
            throw new IllegalArgumentException("User not found");
        }
        pet.setUser(user);
    }

    return service.save(pet);
}

    @MutationMapping
    public String deletePet(@Argument(value = "petId") Integer petId) {
        Pet pet = service.findById(petId);
        if (pet == null) {
            throw new IllegalArgumentException("Pet not found");
        }

        service.delete(petId);
        return "Pet deleted successfully";
    }
}
