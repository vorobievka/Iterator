public class Iterator<Integer> implements java.util.Iterator<Integer> {
    int cursor = -1;

    @Override
    public boolean hasNext() {
        cursor ++;
        if(cursor >= Randoms.array.length) {
            return false;
        }
        return true;
    }

    @Override
    public Integer next() {
        return (Integer) Randoms.array[cursor];
    }
}
