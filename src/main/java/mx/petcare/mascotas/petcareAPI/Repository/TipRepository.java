package mx.petcare.mascotas.petcareAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import mx.petcare.mascotas.petcareAPI.Model.Tip;

@Repository
public interface TipRepository extends JpaRepository<Tip, Integer> {
    
    // Método para obtener tips con paginación
    Page<Tip> findAll(Pageable pageable);
}
