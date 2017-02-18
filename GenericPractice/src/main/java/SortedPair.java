/**
 * Created by Panda on 2/17/2017.
 */
public class SortedPair<T extends Comparable<T>> {

    T first;
    T second;


    public SortedPair(T left, T right){
        if(left.compareTo(right)< 0) {
            this.first = left;
            this.second = right;
        }
        else {

            this.first = right;
            this.second = left;
        }
    }


    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
}
