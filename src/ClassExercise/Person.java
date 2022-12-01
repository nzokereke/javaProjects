package ClassExercise;

public class Person {

    protected String firstName; // instant variables - make up the state of the customer obj,
    protected String lastName;

    public Person(String first, String last) {
        firstName= first;
        lastName  = last;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() < 2) {
            this.firstName = "Not Valid";
        }
        else{
            this.firstName = firstName;
        }
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    void print(){
            System.out.println("First Name : "+firstName +"\nLast Name  : "+ lastName);
        }
}
