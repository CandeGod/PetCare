package mx.petcare.mascotas.petcareAPI.Model;

import java.sql.Date;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Tip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tipid;
    
    @ManyToOne
    @JoinColumn(name = "petid")
    private Pet petid;
    private String title;
    private String description;
    private Date date;
    public Integer getTipid() {
        return tipid;
    }
    public void setTipid(Integer tipid) {
        this.tipid = tipid;
    }
    public Pet getPetid() {
        return petid;
    }
    public void setPetid(Pet petid) {
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
    public Tip(Integer tipid, Pet petid, String title, String description, Date date) {
        this.tipid = tipid;
        this.petid = petid;
        this.title = title;
        this.description = description;
        this.date = date;
    }

    public Tip(){}
    
    
    
    
}


