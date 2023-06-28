package gr.uaeb.cf.ch16.functionalInterfaces;
@FunctionalInterface
public interface IDChecker {

    /**
     *
     *
     * @param student
     *      the {@link Student} Instance
     *
     * @return
     *        true if the id of the student is valid based on the predicate , otherwise returns false
     */

    boolean checkID(Student student); //ta boolean function onomazodai ka ipredicates




}
