package gr.uaeb.cf.ch16;

/**
 *
 * Loosely coupled
 */
public class GenericSpeakingSchool {
    private final  ISpeakable speakable ;


    //Dependancy Injection
    //IOC - Inversion of COntrol
    public  GenericSpeakingSchool(ISpeakable speakable){
        this.speakable=speakable;

        //loosely coupled
    }

    public void learnToSPeak(){
        speakable.speak();
    }
}
