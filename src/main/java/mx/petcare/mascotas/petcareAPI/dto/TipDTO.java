package mx.petcare.mascotas.petcareAPI.dto;


import java.sql.Date;

public class TipDTO {
    private Integer tipid;
    private Integer petid; // Cambia a Integer si quieres usar solo el ID
    private String title;
    private String description;
    private Date date;
    public Integer getTipid() {
        return tipid;
    }
    public void setTipid(Integer tipid) {
        this.tipid = tipid;
    }
    public Integer getPetid() {
        return petid;
    }
    public void setPetid(Integer petid) {
        this.petid = petid;
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