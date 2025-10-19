public class GradeManager {

    public static int[] getFailedGrades(int[] grades) {
        int count=0;
        for (int grade : grades) {
            if (grade <40){
                count++;
            }
        }

        int[] failedGrades=new int[count];
        int index=0;
        for(int grade:grades){
            if(grade<40){
                failedGrades[index++]=grade;
            }
        }

        return failedGrades;
    }


    public static double getAverage(int[] grades) {
        int count=0;
        double avg=0;
        for (int grade:grades){
            avg+=grade;
            count++;
        }

        return Math.round(avg/count);
    }

    public static int[] getRounded(int[] grades) {
        //...
        return new int[0];
    }

    public static int getMaxRounded(int[] grades) {
        //...
        return 0;
    }
}