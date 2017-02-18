import java.util.*;
import java.util.Comparator;

/**
 * Created by Panda on 2/17/2017.
 */
public class Main {


    public static <T> T min(List<T> values, Comparator<T>  comparator) {

        if(values.isEmpty()) {
            throw new IllegalArgumentException("List is empty cannot find minimum");
        }

        T lowestElement = values.get(0);
        for(int i = 1; i < values.size(); i++) {

            T element = values.get(i);

            if(comparator.compare(element, lowestElement)<0) {
                lowestElement = element;
            }

        }

        return lowestElement;
    }


        public static void main(String[] args) {

            Person donDraper = new Person("Don Draper", 87);
            Person peggyParsons = new Person("Peggy Parson", 46);
            Person robertOwns = new Person("Robert Owens", 27);

            List<Person> madMen = new ArrayList<>();

            madMen.add(donDraper);
            madMen.add(peggyParsons);
            madMen.add(robertOwns);

            for (Person p : madMen) {

                System.out.print(p.getAge() + " ");
            }

            System.out.println("");


            Collections.sort(madMen, new AgeComparator());

            for (Person p : madMen) {

                System.out.print(p.getAge() + " ");
            }

            Collections.sort(madMen, new ReverseComparator<>(new AgeComparator()));

            System.out.println("");

            for (Person p : madMen) {

                System.out.print(p.getAge() + " ");
            }

            Person youngestPerson =  min(madMen, new AgeComparator());
            System.out.println(youngestPerson.getName());
            Person oldestPerson =  min(madMen, new ReverseComparator(new AgeComparator()));
            System.out.println(oldestPerson.getName());
            List<Integer> ints = new ArrayList<>();
            ints.add(0);
            ints.add(1);
            ints.add(2);
            ints.add(3);
            System.out.println(min(ints, Integer::compareTo));
        }



        }





























