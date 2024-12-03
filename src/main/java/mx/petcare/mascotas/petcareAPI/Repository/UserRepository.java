package mx.petcare.mascotas.petcareAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.petcare.mascotas.petcareAPI.Model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    
}
