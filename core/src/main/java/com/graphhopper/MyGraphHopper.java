// package com.graphhopper;

// import java.util.Set;
// import com.graphhopper.routing.util.*;
// import com.graphhopper.routing.weighting.*;
// import com.graphhopper.util.*;

// public class MyGraphHopper extends GraphHopper {

//     Set<Integer> forbiddenEdges;
//     public void determineForbiddenEdges() {
//         AllEdgesIterator edges = this.getGraphHopperStorage().getAllEdges();
//         while (edges.next()) {
//             EdgeIteratorState state;
//             edges.copyPropertiesTo(state);
//             String highway = DataFlagEncoder.getHighwayAsString(state);
//             if (highway == "steps") {
//                 forbiddenEdges.add(edges.getEdge())
//                 edges.setDistance(Integer.MAX_VALUE);
//             }
//         }
//     }

//     @Override
//     public Weighting createWeighting(PMap wMap, FlagEncoder encoder)
//     {
//         String weighting = wMap.getWeighting();
//         if ("BLOCKING".equalsIgnoreCase(weighting))
//         {
//             AvoidEdgesWeighting w = new AvoidEdgesWeighting(encoder);
//             w.addEdges(forbiddenEdges);
//             return w;
//         } else
//         {
//             return super.createWeighting(weighting, encoder);
//         }
//     }
// }