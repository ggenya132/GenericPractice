import java.util.Comparator;

/**
 * Created by Panda on 2/17/2017.
 */
public class ReverseComparator<T> implements Comparator<T>{


    Comparator <T> delegateComparator;

        public ReverseComparator(Comparator<T> delegateComparator){

            this.delegateComparator = delegateComparator;
        }

    @Override
    public int compare(T left, T right) {
        return -1 * delegateComparator.compare(left, right);
    }
}
