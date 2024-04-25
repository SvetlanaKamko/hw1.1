package homeWork1;

public class Task3 {
    public static void main(String[] args) {
        byte studentsLudPav = 23;
        byte studentsAnnSerg = 27;
        byte studentsEkatAndr = 30;
        int totalStudents = studentsEkatAndr + studentsAnnSerg + studentsLudPav;
        int totalPaper = 480;
        int perStudent = totalPaper / totalStudents;
        System.out.println("На каждого ученика расчитано " + perStudent + " листов бумаги.");
    }
}
