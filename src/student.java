public class Student {

    private String id;
    private String name;
    private String major;
    private int yearIn;
    private double gpa;
    private String status;
    private int years;

    public Student(String id, String name, String major, int yearIn, double gpa, String status, int years) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.yearIn = yearIn;
        this.gpa = gpa;
        this.status = status;
        this.years = years;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getGpa() {
        return gpa;
    }

    public void print() {
        System.out.println("[" + id + "] " + name);
        System.out.println("Jurusan       : " + major);
        System.out.println("Tahun Masuk   : " + yearIn);
        System.out.println("GPA           : " + gpa);
        System.out.println("Status        : " + status);
        System.out.println("Lama Kuliah   : " + years + " tahun");
        System.out.println("--------------------------------------------");
    }
}
