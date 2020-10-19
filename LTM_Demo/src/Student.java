import java.io.Serializable;

public class Student implements Serializable {
    private int age;
    private int Id;
    private String name;

    public  Student(String name, int age, int Id){
        super();
        this.name  =  name;
        this.age = age;
        this.Id = Id;
    }

    public String toString(){

        return this.name + " " + this.age + " " + this.Id + "\n";
    }
}
