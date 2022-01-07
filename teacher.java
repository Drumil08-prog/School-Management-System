public class teacher extends Person {
    public String teacher_id;
    private String subject;
    private String experience;
    private long course_id;
//constructor
    public teacher(String teacher_id, String subject, String experience, long course_id, String firstname,
            String lastname, String address, String phone_no, String email, String password) {
        super(firstname, lastname, address, phone_no, email, password);
        this.teacher_id = teacher_id;
        this.subject = subject;
        this.experience = experience;
        this.course_id = course_id;
    }
//getters and setters
    public String getTeacher_id() {
        return this.teacher_id;
    }

    public void setTeacher_id(String teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getExperience() {
        return this.experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public long getCourse_id() {
        return this.course_id;
    }

    public void setCourse_id(long course_id) {
        this.course_id = course_id;
    }
}