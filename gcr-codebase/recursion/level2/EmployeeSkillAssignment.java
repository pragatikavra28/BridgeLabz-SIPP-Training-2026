import java.util.ArrayList;

public class EmployeeSkillAssignment {

    static void findTeams(
            int[] skills,
            int target,
            int index,
            ArrayList<Integer> current,
            int currentSum) {

        if (currentSum == target) {
            System.out.println(current);
            return;
        }

        if (index == skills.length || currentSum > target)
            return;

        // Include current skill
        current.add(skills[index]);

        findTeams(
                skills,
                target,
                index + 1,
                current,
                currentSum + skills[index]);

        // Backtrack
        current.remove(current.size() - 1);

        // Exclude current skill
        findTeams(
                skills,
                target,
                index + 1,
                current,
                currentSum);
    }

    public static void main(String[] args) {

        int[] skills = {2, 3, 5, 7};
        int target = 10;

        System.out.println("Possible Teams:");

        findTeams(
                skills,
                target,
                0,
                new ArrayList<>(),
                0);
    }
}