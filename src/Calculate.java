public class Calculate {
    double grade, score = 0;
    int total = 0;
    String noteGrade = "Notlar" + "\n";
    void calculateAgno (int i, int c, String n) {
        convertToGrade(i, n);
        score = score + grade * c;
        total = total + c;
    }

    void convertToGrade (int i, String n){
        if (90 <= i && i <= 100) {
            grade = 4.0;
            noteGrade = noteGrade + n + " AA" + "\n";
        } else if (85 <= i && i <= 89) {
            grade = 3.5;
            noteGrade = noteGrade + n + "  BA" + "\n";
        } else if (75 <= i && i <= 84) {
            grade = 3.0;
            noteGrade = noteGrade + n + " BB" + "\n";
        } else if (70 <= i && i <= 74) {
            grade = 2.5;
            noteGrade = noteGrade + n + " CB" + "\n";
        } else if (60 <= i && i <= 69) {
            grade = 2;
            noteGrade = noteGrade + n + " CC" + "\n";
        } else if (55 <= i && i <= 59) {
            grade = 1.5;
            noteGrade = noteGrade + n + " CD" + "\n";
        } else if (50 <= i && i <=54) {
            grade = 1.0;
            noteGrade = noteGrade + n + " DD" + "\n";
        } else {
            grade = 0;
        }

    }
}
