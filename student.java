
public class student extends Person {
    private int id;
    private int currentyr;
    private String course;
//constructor
    public student(int id, int currentyr, String course, String firstname, String lastname, String address,
            String phone_no, String email, String password) {
        super(firstname, lastname, address, phone_no, email, password);
        this.id = id;
        this.currentyr = currentyr;
        this.course = course;
    }
//getters and setters
    public void setcurrentyr(int currentyr) {
        System.out.println("Current year is " + currentyr);
    }

    public int getcurrentyr() {
        return (int) currentyr;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourse() {
        return this.course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
