public class PersonPOJO {
    private int age;
    private String firstname;
    private String middlename;
    private String lastname;
    private String fathername;
    private String mothername;

    public PersonPOJO() {
    }

    public PersonPOJO(int age) {
        this.age = age;
    }

    public PersonPOJO(String firstname) {
        this.firstname = firstname;
    }

    public PersonPOJO(int age, String firstname) {
        this.age = age;
        this.firstname = firstname;
    }

    public PersonPOJO(int age, String firstname, String middlename) {
        this.age = age;
        this.firstname = firstname;
        this.middlename = middlename;
    }

    public PersonPOJO(int age, String firstname, String middlename, String lastname, String fathername, String mothername) {
        this.age = age;
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.fathername = fathername;
        this.mothername = mothername;
    }

    //Disadvantage
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFathername() {
        return fathername;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public String getMothername() {
        return mothername;
    }

    public void setMothername(String mothername) {
        this.mothername = mothername;
    }
}
