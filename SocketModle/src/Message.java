import java.io.Serializable;

public class Message implements Serializable{
    private  String title;
    private  String body;



    public Message (String title, String body){
        super();
        this.title = title;
        this.body = body;
    }
    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
}
