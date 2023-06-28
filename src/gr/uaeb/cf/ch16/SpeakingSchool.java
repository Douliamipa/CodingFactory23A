package gr.uaeb.cf.ch16;

public class SpeakingSchool {
    private Cat cat ;


    public  SpeakingSchool(){
        cat = new Cat();
        //tidely coupled
    }

    public void learnToSPeak(){
        cat.speak();
    }
}
