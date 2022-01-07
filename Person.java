import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {
    public String firstname;
    public String lastname;
    private String address;
    private String phone_no;
    private String email;
    private int Defaultpasswordlength = 10;
    private String password;
//constructor
    public Person(String firstname, String lastname, String address, String phone_no, String email, String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.phone_no = phone_no;
        this.email = email;
        this.password = setpassword(Defaultpasswordlength);
    }
//getters and setters
    public void setAddress(String address) {
        this.address = address;
    }

    public String getaddress() {
        return address;
    }

    public void setPhone_no(String phone_no) {
        try {
            if (phone_no.length() !=10)
              this.phone_no= null;
        
              String regex = "(0/91)?[7-9][0-9]{9}";
        
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(phone_no);
        
            if (matcher.matches())
              this.phone_no =phone_no; 
            else 
              System.out.println("\nInvalid number passed!");
          } catch (NullPointerException e) {
            System.out.println("\nName cannot be null and should be of 10 digits ");
          }
    }

    public String getfirstname() {
        return firstname;
    }

    public String getlastname() {
        return lastname;
    }

    public void setfirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setlastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_no() {
        return this.phone_no;
    }

    public String getEmail() {
        return this.email;
    }

    public String setpassword(int length) {
        String passwordset = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordset.length());
            password[i] = passwordset.charAt(rand);
        }
        return new String(password);
    }

    public String getPassword() {
        System.out.println("Your password for workEmail is :" + password);
        return this.password;
    }

}