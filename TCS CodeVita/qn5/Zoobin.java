import java.util.*;

public class Zoobin {

    private static class Edge {
        int u, v;

        public Edge(int u, int v) {
            this.u = Math.min(u, v);
            this.v = Math.max(u, v);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Edge edge = (Edge) o;
            return u == edge.u && v == edge.v;
        }

        @Override
        public int hashCode() {
            return Objects.hash(u, v);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int E = scanner.nextInt();
        
        List<Edge> initialEdges = new ArrayList<>();
        for (int i = 0; i < E; i++) {
            initialEdges.add(new Edge(scanner.nextInt(), scanner.nextInt()));
        }

        List<Edge> expectedEdges = new ArrayList<>();
        for (int i = 0; i < E; i++) {
            expectedEdges.add(new Edge(scanner.nextInt(), scanner.nextInt()));
        }
        scanner.close();

        Map<Edge, Edge> targetMap = new HashMap<>();
        for (int i = 0; i < E; i++) {
            targetMap.put(initialEdges.get(i), expectedEdges.get(i));
        }

        
        Map<Edge, List<Edge>> adj = new HashMap<>();
        Set<Edge> allEdges = new HashSet<>(initialEdges);
        
        for (Edge e : allEdges) {
            adj.put(e, new ArrayList<>());
        }
        
        for (Edge current : initialEdges) {
            Edge target = targetMap.get(current);
            adj.get(current).add(target);
        }

        
        Set<Edge> visited = new HashSet<>();
        int cycleCount = 0;

        for (Edge startNode : allEdges) {
            if (!visited.contains(startNode)) {
                
                Edge current = startNode;
                List<Edge> path = new ArrayList<>();
                boolean isCycle = true;
                
                while (!visited.contains(current)) {
                    visited.add(current);
                    path.add(current);
                    
                    if (adj.get(current) == null || adj.get(current).isEmpty()) {
                        isCycle = false; 
                        break;
                    }
                    current = adj.get(current).get(0); 
                }

                if (isCycle) {
                    if (current.equals(startNode)) {
                         cycleCount++;
                    } else {
                    }
                }
            }
        }
        
        System.out.println(cycleCount);
    }
}