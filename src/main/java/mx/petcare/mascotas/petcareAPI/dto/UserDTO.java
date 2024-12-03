package mx.petcare.mascotas.petcareAPI.dto;


public class UserDTO {
    private Integer userid;
    private String firstname;
    private String lastnamep;
    private String lastnamem;
    private String email;
    private String phone;

    public UserDTO() {}

    public UserDTO(Integer userid, String firstname, String lastnamep, String lastnamem, String email, String phone) {
        this.userid = userid;
        this.firstname = firstname;
        this.lastnamep = lastnamep;
        this.lastnamem = lastnamem;
        this.email = email;
        this.phone = phone;
    }

    public Integer getuserid() {
        return userid;
    }

    public void setuserid(Integer userid) {
        this.userid = userid;
    }

    public String getfirstname() {
        return firstname;
    }

    public void setfirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getlastnamep() {
        return lastnamep;
    }

    public void setlastnamep(String lastnamep) {
        this.lastnamep = lastnamep;
    }

    public String getlastnamem() {
        return lastnamem;
    }

    public void setlastnamem(String lastnamem) {
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
}