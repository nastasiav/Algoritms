package my.edu.groc.book.ch6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, List<String>> graph = new HashMap<>();
        setGraphValues(graph);

        boolean isFound = breadthFirstSearch(graph, "you", "jonny");
        if (isFound) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
    }
    private static void setGraphValues(Map<String, List<String>> graph) {
        graph.put("you", Arrays.asList("alice", "bob", "claire"));
        graph.put("bob", Arrays.asList("anuj", "peggy"));
        graph.put("alice", List.of("peggy"));
        graph.put("claire", Arrays.asList("thom", "jonny"));
        graph.put("anuj", Collections.emptyList());
        graph.put("peggy", Collections.emptyList());
        graph.put("thom", Collections.emptyList());
        graph.put("jonny", Collections.emptyList());
    }

    private static boolean breadthFirstSearch(Map<String, List<String>> graph, String firstElement, String searchElement) {
        Set<String> searched = new HashSet<>();
        Queue<String> searchQueue = new ArrayDeque<>(graph.get(firstElement));

        while (!searchQueue.isEmpty()) {
            String elem = searchQueue.poll();
            if (!searched.contains(searchElement)) {
                if (searchElement.equals(elem)) {
                    return true;
                } else {
                    searchQueue.addAll(graph.get(elem));
                    searched.add(elem);
                }
            }
        }
        return false;
    }
}
