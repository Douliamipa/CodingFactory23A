package gr.uaeb.cf.ch16.functionalInterfaces;

public class StudentApp {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student(1,"Alice ", "W.") , new Student(2,"BOB", "D."),
                new Student(3,"Chris", "A."), new Student(4,"Jim","K")
        };

        printStudents(students, new IDChecker() {
            @Override
            public boolean checkID(Student student) {
                return student.getId() >= 3 ;
            }
        });

    }
    public static void printStudents(Student[] students ,IDChecker checker){
        for (Student student : students){
            if (checker.checkID(student)){
                System.out.println(student);
            }
        }
    }

}
