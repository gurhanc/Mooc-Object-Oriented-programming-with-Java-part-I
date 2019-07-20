import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grade grade = new Grade();
        System.out.println("Type exam scores, -1 completes: ");
        int number;

        while (true) {
            number = scanner.nextInt();
            if (number == -1) {
                break;
            }
            if (number >= 0 && number <= 60) {
                grade.addGrade(number);
            }
        }
        grade.assignGrades();
        grade.printOutput();
    }
}
