package objetos.parcial3.examen;

public class UserAccount {

    private String id;
    private String email;
    private String name;
    private String zipCode;
    private String phoneNumber;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
    this.email = email;

    }

    public void setName(String name) {

        this.name = name;
    }


    public void setZipCode(String zipCode) {

        this.zipCode = zipCode;
    }


    public void setPhoneNumber(String phoneNumber) {

        this.phoneNumber = phoneNumber;
    }


    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
