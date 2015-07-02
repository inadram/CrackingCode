package test;

import main.dataStructures.TreesAndGraphs.Two.RouteDirectedGraph;
import main.dataStructures.TreesAndGraphs.Lib.DirectedGraph.Vertex;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RouteDirectedGraphTest {


    Vertex v10 =new Vertex(10);
    Vertex v11 =new Vertex(11);
    Vertex v12 =new Vertex(12);
    Vertex v13 =new Vertex(13);
    Vertex v14 =new Vertex(14);
    Vertex v15 =new Vertex(15);
    Vertex v16 =new Vertex(16);
    Vertex v17 =new Vertex(17);

    @Before
    public void setUp(){
           /*

               14 ---------> 17 ----> 16 <--- 15
               ^
               |
       15 -->  13 ---------> 12
               ^
               |
               11 ---------> 12 <---- 15
               ^
               |
       14 --> 10

         */


        v10.addEdge(v11);
        v11.addEdge(v12);
        v14.addEdge(v10);
        v11.addEdge(v13);
        v13.addEdge(v12);
        v13.addEdge(v14);
        v14.addEdge(v17);
        v17.addEdge(v16);
        v15.addEdge(v12);
        v15.addEdge(v13);
        v15.addEdge(v16);
    }

    @Test
    public void test_if_there_is_route_between_two_vertex(){
        RouteDirectedGraph routeDirectedGraph = new RouteDirectedGraph();
        assertTrue(routeDirectedGraph.check(v10, v11));
    }

    @Test
    public void test_if_there_is_no_route_between_two_vertex(){
        RouteDirectedGraph routeDirectedGraph = new RouteDirectedGraph();
        assertFalse(routeDirectedGraph.check(v11, v15));

    }

    @Test
    public void test_if_there_is_route_between_two_far_vertex(){
        RouteDirectedGraph routeDirectedGraph = new RouteDirectedGraph();
        assertTrue(routeDirectedGraph.check(v10, v16));
    }

}