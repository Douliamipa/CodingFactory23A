package gr.uaeb.cf.ch7;

public class ForStringAPP {
    public static void main(String[] args) {
        String s =" Coding Factory";

        String substring = s.substring(0);
        System.out.println(substring);

        substring = s.substring(0,6);
        System.out.println(substring);



        /*for (int i = 0 ; i < s.length() ; i++){
            System.out.println(s.charAt(i) +"");
        }

        for (char ch : s.toCharArray()){
            System.out.println(ch + "");
        }

        int index = s.indexOf("od");
        System.out.println(index);

        int index1 = s.indexOf("o",7); //xekinaei apo ti  thesi 7
        System.out.println(index1);

        int index2 = s.lastIndexOf("o");
        System.out.println(index2);

        if (s.startsWith("Coding")) System.out.println("Coding Factory");*/




    }



}
