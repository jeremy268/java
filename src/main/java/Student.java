public class Student {
    String name;
    int age;
    String course;

    void introduce() {
        System.out.println("Hi, my name is " + name +
                ". I am " + age +
                " years old and I study " + course + ".");
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "bukayo";
        s1.age = 67;
        s1.course = "Chemistry";
        s1.introduce();

        Student s2 = new Student();
        s2.name = "emman";
        s2.age = 45;
        s2.course = "physics";
        s2.introduce();
    }

}
