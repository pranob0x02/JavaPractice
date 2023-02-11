package RecordProject;

public class ExecutionTest {

    public static void main(String[] args) {

//        for (int i = 1; i <= 5; i++) {
//            Student s = new Student("000" + i,
//                    switch (i) {
//                        case 1 -> "pranob";
//                        case 2 -> "sanjoy";
//                        case 3 -> "mihir";
//                        case 4 -> "shishir";
//                        case 5 -> "arindam";
//                        default -> "testName";
//                    },
//                    "30/03/1998", "java101");
//
//            System.out.println(s);
//        }

        for (int i = 1; i <= 5; i++) {
            StudentRecordTest s = new StudentRecordTest("000" + i,
                    switch (i) {
                        case 1 -> "pranob";
                        case 2 -> "sanjoy";
                        case 3 -> "mihir";
                        case 4 -> "shishir";
                        case 5 -> "arindam";
                        default -> "testName";
                    },
                    "30/03/1998", "java101");

            System.out.println(s);
        }

        Student pojoStudent = new Student("0001", "pojoTest", "30/03/1998", "pojo101");
        StudentRecordTest recordStudent = new StudentRecordTest("0002", "recordTest", "30/03/1998", "record101");

        System.out.println(pojoStudent.getName());
        System.out.println(recordStudent.name());
    }

    /*
     *       POJO vs RECORD
     *   -> If you want to modify data on your class, you won't be using the record
     *
     *   -> But if you're reading a lot of records, from a database or file
     *      source, simply passing this data around, then the record is a big improvement.
     * */
}
