package annotation;

public class CustomerDto {
    @Length(min = 3, max = 20)
    private String name;
    @Email
    private String email;

    public CustomerDto(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
