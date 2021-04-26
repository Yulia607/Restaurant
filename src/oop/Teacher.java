package oop;

public class Teacher {
private String firstName;
private String lastName;
private int age;
private String subject;
private boolean isTeacher;

Teacher () {

}

    public Teacher(boolean isTeacher) { this.isTeacher = isTeacher;}

    public Teacher(String firstName, String lastName, int age, String subject, boolean isTeacher) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.subject = subject;
        this.isTeacher = isTeacher;
    }

    public Teacher(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void setFirstName(String firstName) { this.firstName = firstName;}

    public void setLastName(String lastName) {this.lastName = lastName;}

    public void setAge(int age) {this.age = age;}


}
