package springboot.dto;



import jakarta.validation.constraints.NotEmpty;

public class UserDTO {

    @NotEmpty(message = "Name is required")
    private String name;
    @NotEmpty(message = "Email is required")
    private String email;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
