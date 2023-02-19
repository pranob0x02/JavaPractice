package OOP.TheObjectClass;

public class TestObjectClass {
    public static void main(String[] args) {
        Student max = new Student("Max", 21);
        System.out.println(max);

        primarySchoolStudent jimmy = new primarySchoolStudent("jimmy", 8, "Carole");
        System.out.println(jimmy);
    }
}


class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


class primarySchoolStudent extends Student {
    private String parentName;

    public primarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return "primarySchoolStudent{" +
                "parentName='" + parentName + '\'' +
                "} " + super.toString();
    }
}