import java.util.*;

/**
 * Created by andre on 5/17/2016.
 */
public class MyGraph<T> extends Graph<T> {

    private Map<T, Integer> vertexMap;
    private Vector<VertexInfo<T>> vertexInfo;
    private int numVertices;
    private int numEdges;
    private Stack<Integer> availStack;
    private int getvInfoIndex(T vertex){
        return vertexMap.get(vertex);
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean empty() {
        return false;
    }

    @Override
    public void eraseEdge(T v1, T v2) {

    }

    @Override
    public void eraseVertex(T v) {

    }

    @Override
    public int getWeight(T v1, T v2) {
        return 0;
    }


    public Set<T> getNeighbors(T v) {
        Set<T> adjVert;
        int pos = getvInfoIndex(v);
        if(pos == -1)
            return null;
        Set<Neighbor>


        return null;
    }

    @Override
    public int inDegree(T v) {
        return 0;
    }

    @Override
    public void insertEdge(T v1, T v2, int w) {

    }

    @Override
    public void insertVertex(T v) {

    }

    @Override
    public int numberOfVertices() {
        return 0;
    }

    @Override
    public int outDegree(T v1) {
        return 0;
    }

    @Override
    public void setWeight(T v1, T v2, int w) {

    }


    @Override
    public Iterator begin() {
        return null;
    }

    @Override
    public Iterator end() {
        return null;
    }
}
