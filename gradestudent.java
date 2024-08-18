import java.util.ArrayList;
import java.util.List;

public class gradestudent {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Convert List<Integer> to int[] array
        int[] gradesarr = new int[grades.size()];
        for (int i = 0; i < grades.size(); i++) {
            gradesarr[i] = grades.get(i);
        }

        for (int i = 0; i < gradesarr.length; i++) {
            if (gradesarr[i] >= 38) {
                
                int num =((gradesarr[i] / 5) + 1) * 5;

                

                if (num - gradesarr[i] < 3) {
                    gradesarr[i] = num;
                }

            }
        }

        List<Integer> roundgrades = new ArrayList<>();
        for (int grade : gradesarr) {
            roundgrades.add(grade);
        }

        return roundgrades;
    }


    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);

        List<Integer> result = gradingStudents(grades);

        // Print the result list
        for (int grade : result) {
            System.out.println(grade);
        }
    }
}
