class Student {
    String name;
    int age;
    String grade;

    Student(String name, int age, String grade) {
        name = name;
        age = age;
        grade = grade;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Rahim", 15, "A");
        Student student2 = new Student("Karim", 16, "B");
        Student student3 = new Student("Ayesha", 14, "A+");
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
    }
}
