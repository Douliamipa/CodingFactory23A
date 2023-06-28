package gr.uaeb.cf.ch16.shapes;

import java.io.*;

public class MainAPP {
    public static void main(String[] args) throws IOException{
        File file = new File("C:/tmp/file1.txt");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))){
            Circle circle = new Circle();
            Point point = new Point() ;
            Line line = new Line() ;

            oos.writeObject(circle);
            oos.writeObject(point);
            oos.writeObject(line);


        }catch (FileNotFoundException e ){
            e.printStackTrace();
            throw e ;
        }catch (NotSerializableException e1 ){
            System.out.println("Not serializable");
        }catch (IOException e2){
            System.out.println(e2.getMessage());
        }

        //Περίπου με ίδιο τρόπο και το  input αλλά και στα catch  να έχει συνθήκη για ClassNotFoundException
    }
}
