public class Author {

    // private instance variable, not accessible from outside this class
    private String name;
    private String email;
    private char gender;

    // Default constructor, with arguements.
    // Constructor to construct a new instance of Author with the given name, email and gender
    public Author(String name, String email, char gender) {

        this.name = name;
        this.email = email;
        this.gender = gender;

    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String newEmail){
        this.email = newEmail;
    }

    public char getGender(){
        return gender;
    }

    // Return a description of this instance in the form of
    // Circle[radius=r,color=c]
    public String toString() {
        return "Author[name=" + name + " email=" + email + " gender=" + gender + "]";
    }



}
