public class Course {

    private String code;
    private String name;
    private String lecturer;
    private int sks;
    private boolean heavy;

    public Course(String code, String name, int sks, String lecturer, boolean heavy) {
        this.code = code;
        this.name = name;
        this.sks = sks;
        this.lecturer = lecturer;
        this.heavy = heavy;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public void print() {
        System.out.print("[" + code + "] " + name + " (" + sks + " SKS) - " + lecturer);
        if (heavy) System.out.print(" **HEAVY COURSE**");
        System.out.println();
    }
}
