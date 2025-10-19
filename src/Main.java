public class Main {
    public static void main(String[] args) {
        int[] grades = {29, 37, 38, 41, 84, 67};
        if(grades==null || grades.length==0){
            System.out.print("No grades found");
            return;
        }

        //1
        int[] failedGrades = GradeManager.getFailedGrades(grades);
        if (failedGrades.length == 0) {
            System.out.print("No failed grades");
        } else {
            System.out.print("Failed grades: ");
            for (int grade : failedGrades) {
                System.out.print(grade + " ");
            }
        }

        //2
        int average = (int) GradeManager.getAverage(grades);
        System.out.print("\nAverage of the grades: " + average);

        //3
        int[] rgrades=GradeManager.getRounded(grades);
        System.out.print("\nRounded grades: ");
        for (int grade : rgrades) {
            System.out.print(grade + " ");

        }


    }

}
