package thealgorithms.searches;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * @author: caos321
 * @date: 31 October 2021 (Sunday)
 */
public class BreadthFirstSearch {

    public static Optional<DepthFirstSearch.Node> search(final DepthFirstSearch.Node node, final String name) {
        if (node.getName().equals(name)) {
            return Optional.of(node);
        }

        List<DepthFirstSearch.Node> queue = new ArrayList<>(node.getSubNodes());

        while (!queue.isEmpty()) {
            final DepthFirstSearch.Node current = queue.get(0);

            if (current.getName().equals(name)) {
                return Optional.of(current);
            }

            queue.addAll(current.getSubNodes());

            queue.remove(0);
        }

        return Optional.empty();
    }

    public static void assertThat(final Object actual, final Object expected) {
        if (!Objects.equals(actual, expected)) {
            throw new AssertionError(String.format("expected=%s but was actual=%s", expected, actual));
        }
    }

    public static void main(final String[] args) {
        final DepthFirstSearch.Node rootNode = new DepthFirstSearch.Node("A", List.of(
                new DepthFirstSearch.Node("B", List.of(new DepthFirstSearch.Node("D"), new DepthFirstSearch.Node("F", List.of(
                        new DepthFirstSearch.Node("H"), new DepthFirstSearch.Node("I")
                )))),
                new DepthFirstSearch.Node("C", List.of(new DepthFirstSearch.Node("G"))),
                new DepthFirstSearch.Node("E")
        ));

        {
            final String expected = "I";

            final DepthFirstSearch.Node result = search(rootNode, expected)
                    .orElseThrow(() -> new AssertionError("Node not found!"));

            assertThat(result.getName(), expected);
        }

        {
            final String expected = "G";

            final DepthFirstSearch.Node result = search(rootNode, expected)
                    .orElseThrow(() -> new AssertionError("Node not found!"));

            assertThat(result.getName(), expected);
        }

        {
            final String expected = "E";

            final DepthFirstSearch.Node result = search(rootNode, expected)
                    .orElseThrow(() -> new AssertionError("Node not found!"));

            assertThat(result.getName(), expected);
        }
    }
}
