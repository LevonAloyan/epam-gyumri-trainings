package annotation;

public class CustomerDto {
    @Length(min = 3, max = 20)
    private String name;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomerDto(String name) {
        this.name = name;
    }
}
