/**
 * @author : camilo
 * @created : 2021-12-02
**/

public class Persona {
    String name, lastName;
    int age;
     
    // Builder Method
    public Persona (String name, String lastName, int age){
        this.name = name;
        this.lastName = lastName; 
        this.age = age;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
      return age;
    }
}
