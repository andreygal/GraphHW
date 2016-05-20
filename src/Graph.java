import java.io.OutputStream;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by andre on 5/17/2016.
 */
public abstract class Graph<T> {
    public abstract void clear();
    public abstract boolean empty();
    public abstract void eraseEdge(T v1, T v2);
    public abstract void eraseVertex(T v);
    public abstract int getWeight(T v1, T v2);
    public abstract Set<T> getNeighbors(T v);
    public abstract int inDegree(T v);
    public abstract void insertEdge(T v1, T v2, int w);
    public abstract void insertVertex(T v);
    public abstract int numberOfVertices();
    public abstract int outDegree(T v1);
    public abstract void setWeight(T v1, T v2, int w);
    public abstract Iterator<T> begin();
    public abstract Iterator<T> end();
}
