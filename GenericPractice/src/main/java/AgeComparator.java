import java.util.Comparator;

/**
 * Created by Panda on 2/17/2017.
 */
public class AgeComparator implements Comparator<Person> {

    public int compare(Person person1, Person person2){

        return  Integer.compare(person1.getAge(), person2.getAge());
    }


}
