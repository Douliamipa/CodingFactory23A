package gr.uaeb.cf.ch10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Logger;

public class MobileContactsApp {
    final static Scanner in = new Scanner(System.in);
    final static String[][] contacts = new String[500][3];
    static int pivot = -1 ;
    final static Path path = Paths.get("C:/tmp/log-mobile.txt");

    public static void main(String[] args) {
        boolean quit = false ;
        String s ;
        int choice ;
        String phoneNumber ;

        do {
            printMenu();
            s = getChoice();
            if (s.matches("[qQ]")) quit= true;
            else {
                try {
                    choice = Integer.parseInt(s);
                    if (!isValid(choice)){
                        throw new IllegalArgumentException("Error - choice must be between 1 nad 5 ");
                    }
                    switch (choice){
                        case 1 :
                            printContactMenu();
                            insertControler(getFirstname(),getLastname(),getPhoneNumber());
                            System.out.println("Succsees insert");
                            break;
                        case 2:
                            phoneNumber = getPhoneNumber();
                            deleteControler(phoneNumber);
                            System.out.println("succsess delete");
                            break;
                        case 3 :
                            phoneNumber = getPhoneNumber();
                            printContactMenu();
                            updatetControler(phoneNumber,getFirstname(),getLastname(),getPhoneNumber());
                            System.out.println("soucees update");
                            break;
                        case 4 :
                            phoneNumber = getPhoneNumber() ;
                            String[] contact = getOneController(phoneNumber);
                            printContact(contact);
                            break;
                        case 5:
                            String[][] allContacts = getAllCOntactsCOntroller();
                            printAllContacts(allContacts);
                            break;
                        default:
                            throw new IllegalArgumentException("Bad choice");
                    }
                }catch (IllegalArgumentException e){

                }
            }
        }while (!quit);

    }

    public static void printContact(String[] contact){
        for (String s : contact){
            System.out.println(s + "");
        }
    }

    public static void  printAllContacts(String[][] contacts){
        for (String[] contact : contacts){
            //System.out.printf("%s/t%s/t$s\n",contact[0],contact[1],contact[2]);
            printContact(contact);
        }
    }

    public  static boolean isValid(int choice){
        return (choice >= 1 && choice <= 5);
    }

    public static void printMenu(){
        System.out.println("Επιλέξτε ένα από τα παρακάτω ");
        System.out.println("1.Εισαγωγή Επαφής ");
        System.out.println("2.Διαγραφή Επαφής ");
        System.out.println("3.Ενημέρωση Επαφής ");
        System.out.println("4..Αναζήτηση Επαφής Επαφής ");
        System.out.println("5..Εκτύπωση όλων των επαφών ");
        System.out.println("Q/q για Έξοδο ");
    }

    public static String getChoice(){
        System.out.println("Εισαγετε επιλογή");
        return in.nextLine().trim();
    }

    public static void  printContactMenu(){
        System.out.println("Δλωσε Όνομα , Επόνυμο , τηλέφωνο");
    }

    public static String getFirstname(){
        System.out.println("Εισάγετε όνομα");
        return in.nextLine();
    }
    public static String getLastname(){
        System.out.println("Εισάγετε επόνυμο");
        return in.nextLine().trim();
    }
    public static String getPhoneNumber(){
        System.out.println("Εισάγετε Αριθμό τηλεφώνου");
        return in.nextLine().trim();
    }

    /*

    Controllers
     */

    public static void insertControler(String firstname, String lastname , String phoneNumber){
        try {
            //Validations
            if (firstname == null || lastname == null || phoneNumber == null){
                throw new IllegalArgumentException("Nulls are not allowed");
            }

            if (firstname.length() < 2  || firstname.length() > 50){
                throw  new IllegalArgumentException("First name is not Valid");
            }
            if (lastname.length() < 2  || lastname.length() > 50){
                throw  new IllegalArgumentException("Last name is not Valid");
            }
            if (phoneNumber.length() < 2  || phoneNumber.length() > 12){
                throw  new IllegalArgumentException("Phone number is not Valid");
            }

            //Service call pipo
            insertContactService(firstname.trim(), lastname.trim(),phoneNumber.trim());


        }catch (IllegalArgumentException e){
            e.printStackTrace();
            throw e;
        }
    }

    public static void updatetControler(String oldPhoneNumber,String firstname, String lastname , String newphoneNumber){
        try {
            //Validations

            if (oldPhoneNumber == null || firstname == null || lastname == null || newphoneNumber == null){
                throw new IllegalArgumentException("Nulls are not allowed");
            }
            if (oldPhoneNumber.length() < 2  || oldPhoneNumber.length() > 12){
                throw  new IllegalArgumentException("Old Phone number is not Valid");
            }

            if (firstname.length() < 2  || firstname.length() > 50){
                throw  new IllegalArgumentException("First name is not Valid");
            }
            if (lastname.length() < 2  || lastname.length() > 50){
                throw  new IllegalArgumentException("Last name is not Valid");
            }
            if (newphoneNumber.length() < 2  || newphoneNumber.length() > 12){
                throw  new IllegalArgumentException(" new Phone number is not Valid");
            }

            //Service call pipo
            updateContactService(oldPhoneNumber.trim(),firstname.trim(), lastname.trim(),newphoneNumber.trim());


        }catch (IllegalArgumentException e){
            e.printStackTrace();
            throw e;
        }
    }

    public static String[] deleteControler(String phoneNumber){
        try {
            if (phoneNumber.length() < 2  || phoneNumber.length() > 12){
                throw  new IllegalArgumentException(" Phone number is not Valid");
            }
            return deleteCOntactServise(phoneNumber);

        }catch (IllegalArgumentException e){
            e.printStackTrace();
            throw  e;
        }
    }

    public static String[] getOneController(String phoneNumber){
        try {
            if (phoneNumber.length() < 2  || phoneNumber.length() > 12){
                throw  new IllegalArgumentException(" Phone number is not Valid");
            }
            return getOneContactServise(phoneNumber);
        }catch (IllegalArgumentException e){
            e.printStackTrace();
            throw e;
        }
    }

    public static  String[][] getAllCOntactsCOntroller(){
        try {
            return getAllContactsServise();
        }catch (IllegalArgumentException e){
            e.printStackTrace();
            throw e;
        }
    }

    /*

    Servise Layer
     */

    public  static  String[] getOneContactServise(String phoneNumber){
        try {
            String[] contact = getContactByPhoneNumber(phoneNumber);
            if (contact.length == 0){
                throw new IllegalArgumentException("Contact not Found");
            }
            return contact ;
        }catch (IllegalArgumentException e){
            log(e);
            throw e;
        }
    }

    public static String[][] getAllContactsServise(){
        try {
            String[][] contactsList = getAllContacts();
            if (contactsList.length == 0){
                throw new IllegalArgumentException("List is Empty");
            }
            return  contactsList;
        }catch (IllegalArgumentException e){
            log(e);
            throw e ;
        }

    }

    public static void  insertContactService(String firstname, String lastname ,String phoneNumber){
        try {
            if (!(insert(firstname,lastname,phoneNumber))){
                throw new IllegalArgumentException("Error in insert");
            }
        }catch (IllegalArgumentException e){
            log(e);
            throw e;
        }
    }

    public static void updateContactService(String oldPhoneNumber, String firstname, String lastname , String newPhoneNumber){
        try {
            if (!(update(oldPhoneNumber,firstname,lastname,newPhoneNumber))){
                throw new IllegalArgumentException("Error in Update ");
            }
        }catch (IllegalArgumentException e){
            log(e);
            throw e;
        }
    }

    public  static String[] deleteCOntactServise(String phoneNumber){
        String [] contact ;
        try {
            contact = delete(phoneNumber);
            if (contact.length == 0 ){
                throw  new IllegalArgumentException("Error in Delete");
            }
            return contact;
        }catch (IllegalArgumentException e){
            log(e);
            throw e ;
        }
    }

    /*
        CRUD SERVISES that are provided to servise layer
     */

    public static int getIndexByPhoneNumber(String phoneNumber){
        for (int i = 0 ; i <= pivot ;i++){
            if (contacts[i][2].equals(phoneNumber)){
                return i;
                
            }
        }
        return -1 ;//if not found
    }

    public  static boolean insert(String firstname , String lastname , String phoneNumber){

        if (isFull(contacts)){
            return false;
        }

        if (getIndexByPhoneNumber(phoneNumber) != -1 ){
            return false ;
        }

        pivot ++;
        contacts[pivot][0] = firstname ;
        contacts[pivot][1] = lastname ;
        contacts[pivot][2] = phoneNumber ;

        return true ;
    }

    public static boolean update(String oldPhoneNumber ,String firstname , String lastname , String newPhoneNumber){
        int positionToUpdate = getIndexByPhoneNumber(oldPhoneNumber);
        String[] contact = new String[3];

        if (positionToUpdate == -1){
            //return new String[] {};
            return false ;
        }
//        contact[0]=contacts[positionToUpdate][0];
//        contact[1]=contacts[positionToUpdate][1];
//        contact[2]=contacts[positionToUpdate][2];


        contacts[positionToUpdate][0] = firstname ;
        contacts[positionToUpdate][1] = lastname ;
        contacts[positionToUpdate][2] = newPhoneNumber ;
        return true ;
    }

    public  static  String[] delete(String phoneNumber){
        String[] contact = new String[3];
        int positionToDelete =getIndexByPhoneNumber(phoneNumber);

        if (positionToDelete == -1){
            return new String[]{};
        }
        System.arraycopy(contacts[positionToDelete],0,contact,0,contact.length);

        if (positionToDelete == contact.length - 1) {
            pivot --;
        }else {
            System.arraycopy(contacts, positionToDelete + 1, contacts, positionToDelete, pivot - positionToDelete);
        }
        return contact;
    }

    public static boolean isFull(String[][] arr){
        return pivot == arr.length - 1 ;
    }

    public static String[] getContactByPhoneNumber(String phoneNumber){
        int positionToReturn = getIndexByPhoneNumber(phoneNumber);

        if (positionToReturn ==-1){
            return new String[]{};
        }

        return contacts[positionToReturn];
    }

    public static  String[][] getAllContacts(){
        return Arrays.copyOf(contacts,pivot+1);
    }

    /*

    Custom Logger
    Varargs String[] message
    log( Exceptions , String ...,...)
     */

    public  static  void log(Exception e , String... message){
        try(PrintStream ps = new PrintStream(new FileOutputStream(path.toFile(),true))) {
            ps.println(LocalDateTime.now() + "\n" + e.toString());
            ps.printf("%s",(message.length ==1) ? message[0]  :"");
        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }

    }
}
