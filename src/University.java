public class University {
    public static final String UNIVERSITY_NAME = "AUT";
    public static final String LOCATION = "TASHKENT";
    public static final String WEBSITE = "aut-edu.uz";
    public static final String OFFICIAL_LANGUAGE = "English";

    public static Cohort[] cohorts = new Cohort[100];
    public static Course[] courses = new Course[200];
    public static Teacher[] teachers = new Teacher[200];
    public static Room[] rooms = new Room[700];
    public static OtherStaff[] staffs = new OtherStaff[500];

    public static void printCohortsDetailed() {
        for (int i = 0; i < cohorts.length; i++) {
            Cohort cohort = cohorts[i];

            Course[] courses = cohort.getCourses();

            for (int y = 0; y < courses.length; y++) {
                Course course = courses[y];
                System.out.println(course.toString());
            }

            Student[] students = cohort.getStudents();
            for (int x = 0; x < students.length; x++) {
                Student student = students[x];
                System.out.println(student.toString());
            }
        }
    }

    public static void printCohorts() {
        System.out.println("Cohort List:");

        for (int i = 0; i < cohorts.length; i++) {
            Cohort cohort = cohorts[i];

            if (cohort != null) { //to avoid NullPointerException
                System.out.println(i + "." + cohort.toString());
            }
        }
    }

    public static void printCourses() {
        System.out.println("Course List:");
        for (int i = 0; i < courses.length; i++) {
            Course course = courses[i];

            if (course != null) { //to avoid NullPointerException
                System.out.println(i + "." + course.toString());
            }
        }
    }

    public static void addCohort(int id, String name, String major, boolean isStudying) {
        Cohort cohort = new Cohort();
        cohort.setId(id);
        cohort.setName(name);
        cohort.setMajor(major);
        cohort.setStudying(isStudying);

        //finding empty index
        int i = 0;
        while (cohorts[i] != null) {
            i++;
        }

        cohorts[i] = cohort;
    }

    public static void removeCohort(int index) {
        cohorts[index] = null;
    }

    public static Object addCourse(String name, byte credits, String code, byte sessionsPerWeek) {
        int i = 0;

        Course course = new Course();

        course.setName(name);
        course.setCode(code);
        course.setCredits(credits);
        course.setSessionsPerWeek(sessionsPerWeek);

        //finding empty index
        while (courses[i] != null) {
            i++;
        }
        courses[i] = course;

        return course;
    }

    public static void addTeacher(String name, byte age, String status, String email) {
        Teacher teacher = new Teacher();
        teacher.setName(name);
        teacher.setAge(age);
        teacher.setStatus(status);
        teacher.setEmail(email);

        //finding empty index
        int i = 0;
        while (teachers[i] != null) {
            i++;
        }

        teachers[i] = teacher;
    }

    public static void removeTeacher(int index) {
        teachers[index] = null;
    }

    public static void printTeachers() {
        System.out.println("Teacher List:");
        for (int i = 0; i < teachers.length; i++) {
            Teacher teacher = teachers[i];

            if (teacher != null) { //to avoid NullPointerException
                System.out.println(i + "." + teacher.toString());
            }
        }
    }


    public static void addRoom(short number, byte capacity, String description, boolean busy) {
        Room room = new Room();
        room.setNumber(number);
        room.setCapacity(capacity);
        room.setDescription(description);
        room.setBusy(busy);

        //finding empty index
        int i = 0;
        while (rooms[i] != null) {
            i++;
        }

        rooms[i] = room;
    }

    public static void removeRoom(int index) {
        rooms[index] = null;
    }

    public static void printRooms() {
        System.out.println("Room List:");
        for (int i = 0; i < rooms.length; i++) {
            Room room = rooms[i];

            if (room != null) { //to avoid NullPointerException
                System.out.println(i + "." + room.toString());
            }
        }
    }

    public static void printStaff(){
        System.out.println("Staff List:");
        for (int i = 0; i < staffs.length; i++) {
            OtherStaff staff = staffs[i];

            if (staff != null) { //to avoid NullPointerException
                System.out.println(i + "." + staff.toString());
            }
        }
    }
    public static void removeStaff(int index) {staffs[index] = null;}

    public static void addStaff(String name, String email, String position, int salary, byte age){
        OtherStaff staff = new OtherStaff();
        staff.setName(name);
        staff.setPosition(position);
        staff.setEmail(email);
        staff.setAge(age);
        staff.setSalary(salary);

        //finding empty index
        int i = 0;
        while (staffs[i] != null) {
            i++;
        }

        staffs[i] = staff;
    }
}
