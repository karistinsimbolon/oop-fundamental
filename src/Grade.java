public class Grade {

    private Student student;
    private Course course;
    private int score;
    private String grade;
    private double point;

    public Grade(Student student, Course course, int score, String grade, double point) {
        this.student = student;
        this.course = course;
        this.score = score;
        this.grade = grade;
        this.point = point;
    }

    public void print() {
        System.out.println("Mahasiswa : " + student.getName() + " (" + student.getId() + ")");
        System.out.println("Mata Kuliah : " + course.getName() + " (" + course.getCode() + ")");
        System.out.println("Nilai : " + score + " | Grade: " + grade + " | Point: " + point + " | Status: LULUS ✓");
        System.out.println("--------------------------------------------");
    }
}
