public class Course {
    private String courseName;
    public double fees;
    private int duration;
    private long courseId;
    //public teacher teacher_id;
//constructors
    public Course(String courseName, double fees, int duration, long courseId) {
        this.courseName = courseName;
        this.fees = fees;
        this.duration = duration;
        this.courseId = courseId;
    //    this.teacher_id= teacher_id;
    }
//getters and setters
    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getFees() {
        return this.fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public long getCourseId() {
        return this.courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

//    public String teacher_id(String teacher_id){

//    }

}