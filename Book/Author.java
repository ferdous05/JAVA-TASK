package Book;

public class Author {

    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String Getname() {
        return this.name;

    }

    public String Getemail() {
        return this.email;
    }

    public void Setemail(String email) {
        this.email = email;
    }

    public void Setname(String name) {
        this.name = name;

    }

    public void SetGender(char gender) {
        this.gender = gender;
    }

    public char Getgender() {

        return this.gender;
    }

    @Override
    public String toString() {

        return "Name : " + this.name + "Email : " + this.email + "Gender" + this.gender;

    }

}
