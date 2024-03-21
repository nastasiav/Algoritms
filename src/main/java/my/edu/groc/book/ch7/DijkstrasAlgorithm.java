package my.edu.groc.book.ch7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DijkstrasAlgorithm {
    public static void main(String[] args) {
        //Init graph
        Map<String, Map<String, Double>> graph = new HashMap<>();
        Map<String, Double> costs = new HashMap<>();
        Map<String, String> parents = new HashMap<>();
        initGraph(graph);
        initCosts(costs);
        initParents(parents);
        List<String> processed = new ArrayList<>();


        //work
        String node = findLowestCostNode(costs, processed);
        while (node != null) {
            Double cost = costs.get(node);
            Map<String, Double> neighbors = graph.get(node);
            for (String n : neighbors.keySet()) {
                double newCost = cost + neighbors.get(n);
                if (costs.get(n) > newCost) {
                    costs.put(n, newCost);
                    parents.put(n, node);
                }
            }
            processed.add(node);

            node = findLowestCostNode(costs, processed);
        }

        System.out.println(costs);
    }

    private static String findLowestCostNode(Map<String, Double> costs, List<String> processed) {
        String node = null;
        Double lowest = Double.POSITIVE_INFINITY;

        for (Map.Entry<String, Double> entry : costs.entrySet()) {
            if (!processed.contains(entry.getKey()) &&
                    entry.getValue().compareTo(lowest) < 0) {
                node = entry.getKey();
                lowest = entry.getValue();
            }
        }

        return node;
    }

    private static void initParents(Map<String, String> parents) {
        // the parents table
        parents.put("a", "start");
        parents.put("b", "start");
        parents.put("fin", null);
    }

    private static void initCosts(Map<String, Double> costs) {
        // The costs table
        costs.put("a", 6.0);
        costs.put("b", 2.0);
        costs.put("fin", Double.POSITIVE_INFINITY);
    }

    private static void initGraph(Map<String, Map<String, Double>> graph) {
        graph.put("start", new HashMap<>());
        graph.get("start").put("a", 6.0);
        graph.get("start").put("b", 2.0);

        graph.put("a", new HashMap<>());
        graph.get("a").put("fin", 1.0);

        graph.put("b", new HashMap<>());
        graph.get("b").put("a", 3.0);
        graph.get("b").put("fin", 5.0);

        graph.put("fin", new HashMap<>());
    }
}
