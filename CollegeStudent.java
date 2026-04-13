public class CollegeStudent extends Student {
    String collegeName;

    public CollegeStudent(int rollNo, String name, int[] marks, String collegeName) {
        super(rollNo, name, marks);
        this.collegeName = collegeName;
    }

    public void displayCollegeDetails() {
        displayDetails();
        System.out.println("College: " + collegeName);
    }
}