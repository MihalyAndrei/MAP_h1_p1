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
        int count=grades.length+1;
        for(int grade:grades){
            if(grade<40){
                count--;
            }
        }
        int[] rgrades=new int[count];
        int index=0;
        for (int grade:grades) {
            int multiple=((grade/5)+1)*5;
            if (grade>=38 && multiple-grade<38){
                rgrades[index++]=multiple;
            }
        }
        return rgrades;
    }

    public static int getMaxRounded(int[] grades) {
        int[] rgrades=getRounded(grades);
        int max=rgrades[1];
        for (int rgrade:rgrades){
            if (rgrade>max){
                max=rgrade;
            }
        }
        return max;
    }
}