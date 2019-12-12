package Muslim.muslim.muslim.Model;

public class UserModel
{
    private String text_name;
    private String text_tafser;

    public UserModel()
    {

    }

    public UserModel(String text_name, String text_tafser)
    {
        this.text_name = text_name;
        this.text_tafser = text_tafser;
    }

    public String getText_name() {
        return text_name;
    }

    public void setText_name(String text_name) {
        this.text_name = text_name;
    }

    public String getText_tafser() {
        return text_tafser;
    }

    public void setText_tafser(String text_tafser) {
        this.text_tafser = text_tafser;
    }
}
