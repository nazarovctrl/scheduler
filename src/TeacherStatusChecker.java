public class TeacherStatusChecker {
    public static boolean isValid(String position) {
        if (position == null) {
            System.out.println("Position can't be null");
            return false;
        } else if (position.isEmpty()) {
            System.out.println("Position can't be empty");
            return false;
        }

        String lower = position.toLowerCase();

        for (String valid : Teacher.STATUSES) {
            if (lower.equals(valid)) {
                return true;
            }
        }

        System.out.println("Status is incorrect: '" + position + "' is not a valid university title");
        System.out.print("Valid statues: ");
        for (String status : Teacher.STATUSES) {
            System.out.print(status + ",");
        }

        System.out.println();
        return false;
    }
}
