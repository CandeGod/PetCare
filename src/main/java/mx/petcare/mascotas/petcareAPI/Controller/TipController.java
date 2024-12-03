package mx.petcare.mascotas.petcareAPI.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.graphql.data.method.annotation.Argument;

import java.sql.Date;
import java.util.List;

import mx.petcare.mascotas.petcareAPI.Model.Pet;
import mx.petcare.mascotas.petcareAPI.Model.Tip;
import mx.petcare.mascotas.petcareAPI.Service.TipService;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.MutationMapping;

@Controller
public class TipController {

    @Autowired
    private TipService service;

    @QueryMapping
    public List<Tip> getAllTips() {
        return service.getAll();
    }

    @QueryMapping
    public Tip getTipById(@Argument Integer tipId) {
        return service.getByidTip(tipId);
    }

    @MutationMapping
    public Tip createTip(@Argument Integer petId, @Argument String title, @Argument String description,
            @Argument String date) {
        Tip tip = new Tip();
        tip.setpetid(new Pet(petId)); // Crea un nuevo objeto Pet solo con el ID
        tip.setTitle(title);
        tip.setDescription(description);
        tip.setDate(Date.valueOf(date)); // Asegúrate de convertir el String a Date correctamente
        return service.save(tip);
    }

    @MutationMapping
public Tip updateTip(@Argument Integer tipId, @Argument Integer petId, @Argument String title, @Argument String description, @Argument String date) {
    Tip existingTip = service.getByidTip(tipId);
    if (existingTip != null) {
        existingTip.setpetid(new Pet(petId)); // Cambia a un objeto Pet
        existingTip.setTitle(title);
        existingTip.setDescription(description);
        existingTip.setDate(Date.valueOf(date)); // Asegúrate de convertir correctamente
        return service.save(existingTip);
    }
    return null; // O lanza una excepción
}


    @MutationMapping
    public String deleteTip(@Argument(value = "tipId") Integer tipId) {
        Tip tip = service.getByidTip(tipId);
        if (tip == null) {
            throw new IllegalArgumentException("Tip not found");
        }
        service.delete(tipId);
        return "Tip deleted successfully";
    }
}
