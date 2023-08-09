import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    static Integer[] array = {};

    public Randoms(int min, int max) {
        //...
        Integer a = 0;
        HashSet<Integer> r = new HashSet<Integer>();
        while (r.size() < (max - min)) {
            a = (int) ((Math.random() * (max - min + 1)) + min);
            r.add((int) a);
        }
        array = r.toArray(r.toArray(new Integer[r.size()]));
        System.out.println(Arrays.toString(array));
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator();
    }

}
