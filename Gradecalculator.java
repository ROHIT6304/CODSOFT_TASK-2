import java.util.Scanner;

class Gradecalculator {
    public static void main(String args[]) {
        System.out.println("Grade system");
        System.out.println("If percentage >= 90 then the Grade is A");
        System.out.println("If percentage >80 and <=89 then the Grade is B");
        System.out.println("If percentage >=70 and <=79 then the Grade is C");
        System.out.println("If percentage >=60 and <=69 then the Grade is D");
        System.out.println("If percentage >60 then the Grade is F");
        Grade obj = new Grade();
        obj.marks();
    }
}

class Grade {
    void marks() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("No:of Subjects:");
            int sub = sc.nextInt();
            int sum = 0;

            for (int i = 1; i <= sub; i++) {
                System.out.println("Name of the subject " + i + ":");
                String subject = sc.next();
                System.out.println("Marks Obtained in " + subject + " is:");
                int marks = sc.nextInt();

                if (marks < 0 || marks > 100) {
                    System.out.println("Marks should be between 0 and 100. Please re-enter:");
                    marks = sc.nextInt();
                }

                sum = sum + marks;
            }

            double Percentage =  sum / sub;
            System.out.println("Total marks scored in all subjects is " + sum);
            System.out.println("Average percentage of all subjects is " + Percentage + "%");

            if (Percentage >= 90) {
                System.out.println("Grade of student is A");
            } else if (Percentage > 80 && Percentage <= 89) {
                System.out.println("Grade of student is B");
            } else if (Percentage >= 70 && Percentage <= 79) {
                System.out.println("Grade of student is C");
            } else if (Percentage >= 60 && Percentage <= 69) {
                System.out.println("Grade of student is D");
            } else {
                System.out.println("Grade of student is F");
            }
        }
    }
}