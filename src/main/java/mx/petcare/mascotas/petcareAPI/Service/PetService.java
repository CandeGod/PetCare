package mx.petcare.mascotas.petcareAPI.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
import mx.petcare.mascotas.petcareAPI.Model.Pet;
import mx.petcare.mascotas.petcareAPI.Repository.PetRepository;

@Service
@Transactional
public class PetService {
    @Autowired
    private PetRepository repo; 

    public List<Pet> getAll() {
        return repo.findAll();
    }

    public Pet save(Pet pet) {
        return repo.save(pet);
    }

    public Pet getByidPet(Integer petId) {
        return repo.findById(petId).orElse(null); // Usar orElse para manejar la ausencia de datos
    }

    public void delete(Integer petId) {
        repo.deleteById(petId);
    }

    public Pet findById(Integer id) {
        return repo.findById(id).orElse(null);
    }

    // Método para obtener mascotas paginadas
    public Page<Pet> getPetsPaginated(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return repo.findAll(pageable);
    }
    
    // Método para buscar mascotas por nombre con paginación
    public Page<Pet> findByPetNameContaining(String petName, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return repo.findByPetNameContaining(petName, pageable);
    }
}
