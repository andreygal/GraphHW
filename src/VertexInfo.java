import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by smertmashina on 5/20/16.
 */
public class VertexInfo<T> {
    public enum vertexColor {WHITE, GRAY, BLACK};
    public Iterator<Map<T, Integer>> vtxMapLoc;
    public Set<Neighbor> edges;
    public int inDegree;
    public boolean occupied;
    public vertexColor Color;
    public int dataValue;
    public int parent;
    //default constructor
    public VertexInfo<T>();
    //iterator constructor
    public VertexInfo<T>(Iterator<Map<T, Integer>> iter);
}
