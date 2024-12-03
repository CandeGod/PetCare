package mx.petcare.mascotas.petcareAPI.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
import mx.petcare.mascotas.petcareAPI.Model.Tip;
import mx.petcare.mascotas.petcareAPI.Repository.TipRepository;

@Service
@Transactional
public class TipService {
    @Autowired
    private TipRepository repo;

    public List<Tip> getAll(){
        return repo.findAll();
    }

    
    public Page<Tip> getAll(Pageable pageable) {
        return repo.findAll(pageable);
    }

    public Tip save(Tip tip){
        return repo.save(tip);
    }

    public Tip getByidTip(Integer tipid){
        return repo.findById(tipid).orElse(null);
    }

    public void delete(Integer tipId){
        repo.deleteById(tipId);
    }
}
