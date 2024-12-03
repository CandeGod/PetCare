package mx.petcare.mascotas.petcareAPI.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.petcare.mascotas.petcareAPI.Model.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, Integer>{
     Page<Pet> findByPetnameContaining(String petname, Pageable pageable);
}
