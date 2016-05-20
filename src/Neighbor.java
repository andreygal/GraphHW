/**
 * Created by andre on 5/17/2016.
 */
public class Neighbor implements Comparable<Neighbor> {
    public int dest;
    public int weight;

    public Neighbor() {
        dest = 0;
        weight = 0;
    }

    public Neighbor(int dest, int weight) {
        this.dest = dest;
        this.weight = weight;
    }

    @Override
    public int compareTo(Neighbor o) {
        return 0;
    }
}
