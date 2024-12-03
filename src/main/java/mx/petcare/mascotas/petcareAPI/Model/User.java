package mx.petcare.mascotas.petcareAPI.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userid;
    private String firstname;
    private String lastnamep;
    private String lastnamem;
    private String email;
    private String phone;
    private String password;
    
   

    public Integer getUserid() {
        return userid;
    }



    public void setUserid(Integer userid) {
        this.userid = userid;
    }



    public String getFirstname() {
        return firstname;
    }



    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }



    public String getLastnamep() {
        return lastnamep;
    }



    public void setLastnamep(String lastnamep) {
        this.lastnamep = lastnamep;
    }



    public String getLastnamem() {
        return lastnamem;
    }



    public void setLastnamem(String lastnamem) {
        this.lastnamem = lastnamem;
    }



    public String getEmail() {
        return email;
    }



    public void setEmail(String email) {
        this.email = email;
    }



    public String getPhone() {
        return phone;
    }



    public void setPhone(String phone) {
        this.phone = phone;
    }



    public String getPassword() {
        return password;
    }



    public void setPassword(String password) {
        this.password = password;
    }



    @Override
    public String toString() {
        return "User [userid=" + userid + ", firstname=" + firstname + ", lastnamep=" + lastnamep + ", lastnamem="
                + lastnamem + ", email=" + email + ", phone=" + phone + ", password=" + password + "]";
    }



   
}
