 import java.util.*;
 import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) {
        int choice;
        System.out.println("------------------------------------------------------");
        System.out.println("Welcome to School management system.");
        System.out.println("------------------------------------------------------");

        System.out.println();
        int tn = 0;
        int n = 0;
        int cn = 0;
        teacher[] trr = new teacher[0];
        student[] arr = new student[0];
        Course[] crr = new Course[0];

        while (true) {
            System.out.println("Please enter the category to which you belong ?");
            Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.println("1. Faculty member");
            System.out.println("2. Student ");
            System.out.println("3. Course ");
            System.out.println("4. Faculty Database ");
            System.out.println("5. Student Database ");
            System.out.println("6. Course Database");
            System.out.println("7. Exit");
            System.out.println();
            System.out.println("Select the desired option : ");
            choice = sc.nextInt();
            System.out.println();
            if (choice == 1) {
                System.out.println("You have opted for Faculty member.");
            }
            if (choice == 2) {
                System.out.println("You have opted for Student.");
            }
            if (choice == 3) {
                System.out.println("You have opted for Course category.");
            }
            if (choice == 4) {
                System.out.println("You have opted to exit.");
            }
            int flag = 0;
            switch (choice) {
            case 1:
                System.out.println("Enter no of faculty members you want to create.");
                tn = sc.nextInt();
                trr = new teacher[tn + 1];
                for (int i = 1; i <= tn; i++) {
                    System.out.println("\n");
                    System.out.println(" Enter details of faculty " + i);
                    System.out.println("\n");
                    System.out.println("1. Enter Faculty ID : ");
                    String teacher_id;
                    while (true) {
                        teacher_id = sc.next();
                        if (teacher_id.equals("000")) {
                            System.out.println("Invalid ID- Faculty ID exists between 001-007");
                        } else {
                            break;
                        }
                    }
                    System.out.println();
                    System.out.println("2. Enter Firstname");
                    String firstname;
                    while (true) {
                        firstname = sc.next();
                        if (firstname == " ") {
                            System.out.println("Invalid firstname");
                        } else {
                            break;
                        }
                    }
                    System.out.println();
                    System.out.println("3. Enter Lastname");
                    String lastname;
                    while (true) {
                        lastname = sc.next();
                        if (lastname == "") {
                            System.out.println("Lastname cannot be null");
                        } else {
                            break;
                        }
                    }
                    System.out.println();
                    System.out.println("4. Enter your mobile number");
                    String phone_no;
                     while (true) {
                       phone_no = sc.next();
                        if (phone_no.length() < 10) {
                            System.out.println("Please check the mobile number , it should have 10 digits");
                        } else {
                            break;
                        }
                    }
                    System.out.println();
                    System.out.println("5. Enter your current functional email id : ");
                    String email = sc.next();
                    System.out.println();
                    System.out.println("6. Enter Subject");
                    String subject = sc.next();
                    System.out.println();
                    System.out.println("7. Enter Experience in years ");
                    String experience;
                    while (true) {
                        experience = sc.next();
                        if (experience.equals("0")) {
                            System.out.println("wrong input");
                        } else {

                            break;
                        }
                    }
                    System.out.println();
                    System.out.println("9. Enter Faculty course ID");
                    long course_id = sc.nextLong();
                    System.out.println();
                    System.out.println("10. Enter address : ");
                    String address = sc.next();
                    System.out.println();
                    String workemail = firstname + "." + lastname + "@nmims.edu.in";
                    System.out.println("12. Your  generated work email is : " + workemail);

                    String password = "password";
                    trr[i] = new teacher(teacher_id, subject, experience, course_id, firstname, lastname, address,
                            phone_no, email, password);
                    trr[i].setEmail(workemail);
                    System.out.println("");
                    System.out.println(
                            "-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
                    System.out.println(
                            "Do you want to confirm your data [Y/N] ? (It will automatically get saved in our database) ");
                    System.out.println();
                    char ch = sc.next().charAt(0);
                    if (ch == 'Y' || ch == 'y') {
                        System.out.println("------------------------------------------------------");
                        System.out.println("1. Faculty ID : " + trr[i].getTeacher_id());
                        System.out.println("2. Firstname :" + trr[i].getfirstname());
                        System.out.println("3. Lastname : " + trr[i].getlastname());
                        System.out.println("4. Mobile number : " + trr[i].getPhone_no());
                        System.out.println("6. Address: " + trr[i].getaddress());
                        System.out.println("7. Your Subject is : " + trr[i].getSubject());
                        System.out.println("8. Experience is : " + trr[i].getExperience());
                        System.out.println("9. Your working email :" + trr[i].getEmail());
                        System.out.println("11. Generated emailid : " + workemail);
                        System.out.println("------------------------------------------------------");
                    }
                }
                break;

            case 2:

                System.out.println("Enter no of students you want to create");
                n = sc.nextInt();
                arr = new student[n + 1];
                for (int i = 1; i <= n; i++) {
                    System.out.println("\n");
                    System.out.println("Enter details of Student " + i);
                    System.out.println("\n");

                    System.out.println("1. Enter Student ID : ");
                    int id = sc.nextInt();
                    System.out.println();
                    System.out.println("2. Enter Firstname");
                    String firstname = sc.next();
                    System.out.println();
                    System.out.println("3. Enter Lastname");
                    String lastname = sc.next();
                    System.out.println();
                    System.out.println("5. Enter your mobile number");
                    String phone_no = sc.next();
                    System.out.println();
                    System.out.println("6. Enter address : ");
                    String address = sc.next();
                    System.out.println();
                    System.out.println("7. Enter your current year : ");
                    int currentyr = sc.nextInt();
                    System.out.println();
                    System.out.println();
                    System.out.println("11. Enter Course Name");
                    String course = sc.next();
                    System.out.println();
                    System.out.println("12. Enter your current functional  email id : ");
                    String email = sc.next();
                    System.out.println();
                    System.out.println();
                    String workemail = firstname + "." + lastname + "@nmims.edu.in";
                    System.out.println("Your  generated work email is : " + workemail);
                    System.out.println();
                    String password = "password";

                    arr[i] = new student(id, currentyr, course, firstname, lastname, address, phone_no, email,
                            password);
                    arr[i].setEmail(workemail);
                    System.out.println("");
                    System.out.println(
                            "-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
                    System.out.println("Do you want to confirm your data [Y/N]");

                    char ch = sc.next().charAt(0);
                    if (ch == 'Y' || ch == 'y') {
                        System.out.println("------------------------------------------------------");
                        System.out.println("Student ID : " + arr[i].getId());
                        System.out.println("Firstname :" + arr[i].getfirstname());
                        System.out.println("Lastname : " + arr[i].getlastname());
                        System.out.println("Mobile number : " + arr[i].getPhone_no());
                        System.out.println("Address: " + arr[i].getaddress());
                        System.out.println("Current Year : " + arr[i].getcurrentyr());
                        System.out.println("Your course name : " + arr[i].getCourse());
                        System.out.println("Your working email :" + arr[i].getEmail());
                        System.out.println("------------------------------------------------------");
                    } else
                        break;
                }
                break;

            case 3:

                System.out.println("Enter no of courses you want : ");
                cn = sc.nextInt();
                crr = new Course[cn + 1];
                for (int i = 1; i <= cn; i++) {
                    System.out.println("\n");
                    System.out.println("1. Enter details of the course" + i);
                    System.out.println("\n");
                    System.out.println("2. Enter Course id ");
                    long courseId = sc.nextLong();
                    System.out.println();
                    System.out.println("3.Enter course name is : ");
                    String courseName = sc.next();
                    System.out.println();
                    System.out.println("5. Fees to be paid for this course is ");
                    double fees = sc.nextDouble();
                    System.out.println();
                    System.out.println("6. Your duration for the Course  is");
                    int duration = sc.nextInt();
                    System.out.println();
                    
                    crr[i] = new Course(courseName, fees, duration, courseId);
                    System.out.println(
                            "-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
                    System.out.println("Do you want to confirm your data [Y/N]");

                    char ch = sc.next().charAt(0);
                    if (ch == 'Y' || ch == 'y') {
                        System.out.println("------------------------------------------------------");
                        System.out.println("Course ID : " + crr[i].getCourseId());
                        System.out.println("Course name :" + crr[i].getCourseName());
                        System.out.println("Fees :" + crr[i].getFees());
                        System.out.println("Duration   : " + crr[i].getDuration());
                        System.out.println("------------------------------------------------------");
                    } else
                        break;
                }
                break;

            case 4:
                System.out.println("FACULTY DATABASE");

                System.out.println("Sr.no" + "   " + "Firstname" + "     " + "Lastname" + "        " + "ID" + "        "
                        + "Contact no" + "       " + " Subject");
                for (int i = 1; i <= tn; i++) {
                    System.out.println(i + "." + "     \t " + trr[i].getfirstname() + "       \t" + trr[i].getlastname()
                            + "     " + trr[i].getTeacher_id() + "    " + trr[i].getPhone_no() + "           "
                            + trr[i].getSubject());
                }
                break;

            case 5:
                System.out.println("STUDENT DATABASE");
                System.out.println("Sr.no" + "   " + "Firstname" + "   " + "Lastname" + "   " + "ID" + "   "
                        + "Contact no" + "   " + " Subject");
                for (int i = 1; i <= n; i++) {
                    System.out.println(i + "." + "     \t " + arr[i].getfirstname() + "       \t" + arr[i].getlastname()
                            + "     " + arr[i].getId() + "    " + arr[i].getPhone_no() + "      " + arr[i].getCourse());
                }
                break;

            case 6:
                System.out.println("COURSE DATABASE");
                System.out.println(
                        "Sr.no" + "   " + "ID" + "   " + "Name" + "      " + "Fees" + "      " + "Duration in hrs");
                for (int i = 1; i <= cn; i++) {
                    System.out.println(i + "." + "     \t " + crr[i].getCourseId() + "  " + crr[i].getCourseName()
                            + "      " + crr[i].getFees() + "   " + crr[i].getDuration());
                }
                break;

            case 7:
                flag = 1;
                break;

            default:
                flag = 1;
                break;
            }
            if (flag == 1)
                break;
        }
    }
}