import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // THIS IS TO INPUT SCHOOL DETAILS
        System.out.print("Enter School Name: ");
        String schoolName = input.nextLine();

        System.out.print("Enter Teacher Name: ");
        String teacherName = input.nextLine();

        System.out.print("Enter Grade: ");
        int grade = input.nextInt();

        System.out.print("Enter Year: ");
        int year = input.nextInt();

        // FOR STUDENTS
        final int NUMBER_OF_STUDENTS = 1;   // this is declaring that this is a constant number of students.Which can be changed if the no of students vary

        String[] names = new String[NUMBER_OF_STUDENTS];// this is to create actual array of objects that will be storing names and marks for the next variables.
        double[] eng = new double[NUMBER_OF_STUDENTS];
        double[] math = new double[NUMBER_OF_STUDENTS];
        double[] hist = new double[NUMBER_OF_STUDENTS];
        double[] geo = new double[NUMBER_OF_STUDENTS];
        double[] sci = new double[NUMBER_OF_STUDENTS];
        double[] prog = new double[NUMBER_OF_STUDENTS];
        double[] total = new double[NUMBER_OF_STUDENTS];
        char[] rank = new char[NUMBER_OF_STUDENTS];

        input.nextLine();

        //THIS IS TO INPUT STUDENTS NAMES AND MARKS
        for (int i = 0; i < NUMBER_OF_STUDENTS; i++) {
            System.out.println("\nENTER DETAILS FOR THE STUDENTS " + (i + 1));//Increment from student 1 up to max

            System.out.print("Name: ");
            names[i] = input.nextLine();

            System.out.print("English: ");
            eng[i] = input.nextDouble();

            System.out.print("Math: ");
            math[i] = input.nextDouble();

            System.out.print("History: ");
            hist[i] = input.nextDouble();

            System.out.print("Geography: ");
            geo[i] = input.nextDouble();

            System.out.print("Science: ");
            sci[i] = input.nextDouble();

            System.out.print("Programming: ");
            prog[i] = input.nextDouble();

            input.nextLine();
        }

        // THIS IS FOR COMPUTATION OF TOTAL MARKS AND GRADING ACCORDING TO RANKS
        int countA = 0, countB = 0, countC = 0, countD = 0, countF = 0;

        for (int i = 0; i < NUMBER_OF_STUDENTS; i++) {
            total[i] = eng[i] + math[i] + hist[i] + geo[i] + sci[i] + prog[i];

            if (total[i] >= 540) {
                rank[i] = 'A';
                countA++;// increment countA by one each time a student scores an A
            } else if (total[i] >= 480) {
                rank[i] = 'B';
                countB++;
            } else if (total[i] >= 420) {
                rank[i] = 'C';
                countC++;
            } else if (total[i] >= 360) {
                rank[i] = 'D';
                countD++;
            } else {
                rank[i] = 'F';
                countF++;
            }
        }

        // SUBJECTS MEANS
        double totalmarksEng = 0, totalmarksMath = 0, totalmarksHist = 0, totalmarksGeo = 0, totalmarksSci = 0, totalmarksProg = 0, tTotal = 0;

        for (int i = 0; i < NUMBER_OF_STUDENTS; i++) {
            totalmarksEng += eng[i];
            totalmarksMath += math[i];
            totalmarksHist += hist[i];
            totalmarksGeo += geo[i];
            totalmarksSci += sci[i];
            totalmarksProg += prog[i];
            tTotal += total[i];
        }

        double avgEng = totalmarksEng / NUMBER_OF_STUDENTS;
        double avgMath = totalmarksMath / NUMBER_OF_STUDENTS;
        double avgHist = totalmarksHist / NUMBER_OF_STUDENTS;
        double avgGeo = totalmarksGeo / NUMBER_OF_STUDENTS;
        double avgSci = totalmarksSci / NUMBER_OF_STUDENTS;
        double avgProg = totalmarksProg / NUMBER_OF_STUDENTS;
        double avgTotal = tTotal / NUMBER_OF_STUDENTS;

        // OUTPUT STUDENTS REPORT

        System.out.println("==========================================================================================");
        System.out.printf("\n\t\t\t\t\t\t\tSchool Name: " + schoolName);
        System.out.printf("\n\t\t\t\t\t\t\t\tTeacher: " + teacherName);
        System.out.printf("\n\t\t\t\t\t\t\t\t  Grade: " +grade);
        System.out.printf("\n\t\t\t\t\t\t\t\t   Year: " +year);
        System.out.println("\n==========================================================================================");

        System.out.printf("%-15s %-8s %-8s %-8s %-10s %-8s %-12s %-8s %-5s%n",
                "Student Name", "English", "Math", "History",
                "Geography", "Science", "Programming", "Total", "Rank");

        System.out.println("------------------------------------------------------------------------------------------");

        for (int i = 0; i < NUMBER_OF_STUDENTS; i++) {
            System.out.printf("%-15s %-8.2f %-8.2f %-8.2f %-10.2f %-8.2f %-12.2f %-8.2f %-5c%n",
                    names[i], eng[i], math[i], hist[i], geo[i],
                    sci[i], prog[i], total[i], rank[i]);
        }

        System.out.println("------------------------------------------------------------------------------------------");

        // OUT PUT SUBJECT TOTALS
        System.out.printf("%-15s %-8.2f %-8.2f %-8.2f %-10.2f %-8.2f %-12.2f %-8.2f%n",
                "Totals", totalmarksEng, totalmarksMath, totalmarksHist, totalmarksGeo, totalmarksSci, totalmarksProg, tTotal);

        //OUTPUT SUBJECT AVERAGES
        System.out.printf("%-15s %-8.2f %-8.2f %-8.2f %-10.2f %-8.2f %-12.2f %-8.2f%n",
                "Averages", avgEng, avgMath, avgHist, avgGeo,
                avgSci, avgProg, avgTotal);

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.printf("\t\t\t\t\tRanks  A's: %d   B's: %d   C's: %d   D's: %d   F's: %d%n",
                countA, countB, countC, countD, countF);
    }
}
