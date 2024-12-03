package mx.petcare.mascotas.petcareAPI.Service;

import mx.petcare.mascotas.petcareAPI.Model.User;
import mx.petcare.mascotas.petcareAPI.Repository.UserRepository; // Asegúrate de que tienes este repositorio
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findById(Integer userid) {
        return userRepository.findById(userid).orElse(null);
    }
}
