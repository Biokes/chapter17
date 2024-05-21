package contactManager.model;

public class Contact {
    private String name;
    private String email;
    private String number;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getNumber(){
        return number;
    }
    public void setNumber(String number){
        this.number = number;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
