public class Student {

    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        if (marks >= 50) {
            return "Pass";
        }
        return "Fail";
    }
}