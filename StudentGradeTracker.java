import java.util.Scanner;
public class StudentGradeTracker {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of Student :");
        int NumOfStudent = in.nextInt();
        int[] grade = new int[NumOfStudent];
        for (int i = 0; i < NumOfStudent; i++) {
            System.out.println("Enter the Mark of Student " + (i + 1) + " :");
            while(true) {
                int inputgrade = in.nextInt();
                if(inputgrade>=0){
                    grade[i]=inputgrade;
                    break;}
                    else{
                        System.out.println("please enter valide mark");
                    }
                }
            }

        double avg = Average(grade);
        int high =high(grade);
        int low = low(grade);
        System.out.println("\nGrade Statistics:");
        System.out.printf(" Average Score  : %.2f\n", avg);
        System.out.println(" Hight Score    : "+high);
        System.out.println(" Lowest Score   : "+low);

        in.close();
    }

    private static double Average(int[] grade) {
        int sum = 0;
        for (int j = 0; j < grade.length; j++) {
            sum =sum+ grade[j];
        }
        double avg = (double) sum / grade.length;
        return avg;
    }

    private static int high(int[] grade) {
        int high = grade[0];
        for (int i = 1; i < grade.length; i++) {

            if (grade[i] > high) {
                high = grade[i];
            }

        }
        return high;
    }
    private static int low (int[] grade){
        int low=grade[0];
        for (int i=1;i<grade.length;i++){
            if(grade[i]<low){
                low =grade[i];
            }
        }
        return low;
    }

}

