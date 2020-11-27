import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class WriteObject {
    public static  void main(String[] args){
        try {
            ObjectOutputStream oob = new ObjectOutputStream(new FileOutputStream("demo.txt"));
//            List<Student> listSt = new ArrayList<>();
//            listSt.add(new Student("tuan anh",15,122));
//            listSt.add(new Student("hai dang",15,142));
//            listSt.add(new Student("master",16,133));
//            listSt.add(new Student("erik",21,256));

//            for (Student student : listSt){
//                oob.writeObject(student);
//            }

            oob.writeObject(new Student("master",16,133));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
