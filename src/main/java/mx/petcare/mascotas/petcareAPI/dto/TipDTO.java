package mx.petcare.mascotas.petcareAPI.dto;


import java.sql.Date;

public class TipDTO {
    private Integer tipId;
    private Integer petId; // Cambia a Integer si quieres usar solo el ID
    private String title;
    private String description;
    private Date date;

    // Getters y Setters
    public Integer getTipId() {
        return tipId;
    }

    public void setTipId(Integer tipId) {
        this.tipId = tipId;
    }

    public Integer getPetId() {
        return petId;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}