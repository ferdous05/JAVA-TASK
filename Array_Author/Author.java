package Array_Author;

public class Author {

    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {

        this.name = name;
        this.email = email;
        this.gender = gender;

    }

    public void SetName(String name) {

        this.name = name;
    }

    public void SetEmail(String email) {

        this.email = email;
    }

    public void SetGender(char gender) {

        this.gender = gender;
    }

    public String Get_name() {

        return this.name;
    }

    public String Get_email() {

        return this.email;
    }

    public char Get_gender() {

        return this.gender;
    }
    @Override
public String toString(){

return    "Author Name :"+this.name+"Email :"+this.email+"Gender: "+this.gender;
}

}
