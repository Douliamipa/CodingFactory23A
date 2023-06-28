package gr.uaeb.cf.ch11;

import java.util.Scanner;

/**
 *
 * Definition of a simple Student class
 * POJO (Plain OLD JAVA OBJECT)
 * Student JAVA BEANS
 */
public class Student {


        private  static int studentCount  ; //an einai final den allazei timi
        static Scanner in = new Scanner(System.in);

        static {
                int num = in.nextInt();
                studentCount= (num ==1) ?1 :0 ;
        }
        private int id ;
        private String firstName;
        private String lastName;

        public Student(){
                studentCount++;
                //tha mporouse kai na arxikopoihthei kai edw strudentsCOunt=0; an einai final arxikopoieitai amesa i sto static block
        }

        public Student(int id, String firstName, String lastName) {
                this.id = id;
                this.firstName = firstName;
                this.lastName = lastName;
                studentCount++;
        }
        public static int getStudentsCount(){
                return studentCount;
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getFirstName() {
                return firstName;
        }

        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }

        public String getLastName() {
                return lastName;
        }

        public void setLastName(String lastName) {
                this.lastName = lastName;
        }
}
