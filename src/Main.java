public class Main {

    public static void main(String[] args) {

        System.out.println("============================================");
        System.out.println("STUDENT GRADE MANAGEMENT SYSTEM");
        System.out.println("============================================\n");

        // REGISTRASI MAHASISWA
        System.out.println("=== REGISTRASI MAHASISWA ===");
        Student s1 = new Student("STD001", "John Doe", "Teknik Informatika", 2021, 3.65, "Sangat Memuaskan", 4);
        Student s2 = new Student("STD002", "Jane Smith", "Sistem Informasi", 2022, 3.85, "Cumlaude", 3);
        Student s3 = new Student("STD003", "Bob Wilson", "Teknik Informatika", 2020, 2.85, "Memuaskan", 5);

        System.out.println("Mahasiswa berhasil ditambahkan: STD001 - John Doe");
        System.out.println("Mahasiswa berhasil ditambahkan: STD002 - Jane Smith");
        System.out.println("Mahasiswa berhasil ditambahkan: STD003 - Bob Wilson\n");

        // REGISTRASI MATA KULIAH
        System.out.println("=== REGISTRASI MATA KULIAH ===");
        Course c1 = new Course("CS101", "Pemrograman Dasar", 3, "Pak Budi", false);
        Course c2 = new Course("CS102", "Struktur Data", 4, "Bu Ani", true);
        Course c3 = new Course("MTK201", "Kalkulus II", 3, "Pak Joko", false);
        Course c4 = new Course("ENG101", "English for IT", 2, "Miss Linda", false);

        System.out.println("Mata kuliah berhasil ditambahkan: CS101 - Pemrograman Dasar");
        System.out.println("Mata kuliah berhasil ditambahkan: CS102 - Struktur Data");
        System.out.println("Mata kuliah berhasil ditambahkan: MTK201 - Kalkulus II");
        System.out.println("Mata kuliah berhasil ditambahkan: ENG101 - English for IT\n");

        // INPUT NILAI
        System.out.println("=== INPUT NILAI ===");
        Grade g1 = new Grade(s1, c1, 85, "A", 4.0);
        Grade g2 = new Grade(s1, c2, 78, "B+", 3.3);
        Grade g3 = new Grade(s2, c1, 92, "A", 4.0);
        Grade g4 = new Grade(s2, c4, 88, "A", 4.0);
        Grade g5 = new Grade(s3, c3, 65, "B-", 2.7);
        Grade g6 = new Grade(s3, c1, 70, "B", 3.0);

        System.out.println("Nilai berhasil diinput: John Doe - Pemrograman Dasar: 85 (A)");
        System.out.println("Nilai berhasil diinput: John Doe - Struktur Data: 78 (B+)");
        System.out.println("Nilai berhasil diinput: Jane Smith - Pemrograman Dasar: 92 (A)");
        System.out.println("Nilai berhasil diinput: Jane Smith - English for IT: 88 (A)");
        System.out.println("Nilai berhasil diinput: Bob Wilson - Kalkulus II: 65 (B-)");
        System.out.println("Nilai berhasil diinput: Bob Wilson - Pemrograman Dasar: 70 (B)\n");

        // DAFTAR MAHASISWA
        System.out.println("============================================");
        System.out.println("DAFTAR MAHASISWA");
        System.out.println("============================================");
        s1.print();
        s2.print();
        s3.print();
        System.out.println("Total Mahasiswa: 3\n");

        // DAFTAR MATA KULIAH
        System.out.println("============================================");
        System.out.println("DAFTAR MATA KULIAH");
        System.out.println("============================================");
        c1.print();
        c2.print();
        c3.print();
        c4.print();
        System.out.println("Total Mata Kuliah: 4\n");

        // DAFTAR NILAI
        System.out.println("============================================");
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("============================================");
        g1.print();
        g2.print();
        g3.print();
        g4.print();
        g5.print();
        g6.print();
        System.out.println("============================================\n");

        // STATISTIK SISTEM
        System.out.println("============================================");
        System.out.println("STATISTIK SISTEM");
        System.out.println("============================================");
        System.out.println("Mahasiswa dengan GPA Tertinggi: Jane Smith (3.85)");
        System.out.println("Total Mahasiswa Terdaftar: 3");
        System.out.println("Total Mata Kuliah Tersedia: 4");
        System.out.println("============================================");
    }
}
