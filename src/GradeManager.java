public class GradeManager {

    public static int[] getFailedGrades(int[] grades) {
        if(grades==null){
            return new int[0];
        }
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
        //...
        return 0.0;
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