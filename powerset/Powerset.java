import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Powerset {

    public Set<Set<Integer>> recursive(List<Integer> input) {
        if (input.isEmpty())
            return emptyPowerset();

        var result = recursive(input.subList(1, input.size()));
        var copy   = deepCopy(result);

        copy.forEach(s -> s.add(input.getFirst()));

        result.addAll(copy);
        return result;
    }

    public Set<Set<Integer>> iterative(List<Integer> input) {
        var result = emptyPowerset();

        input.forEach(i -> {
            var copy = deepCopy(result);
            copy.forEach(s -> s.add(i));
            result.addAll(copy);
        });

        return result;
    }

    public Set<Set<Integer>> bitManipulation(List<Integer> input) {
        var result = new HashSet<Set<Integer>>();

        for (int b = 0; b < (1 << input.size()); b++) {
            var subset = new HashSet<Integer>();

            for (int i = 0; i < input.size(); i++)
                if ((b & (1 << i)) > 0) subset.add(input.get(i));

            result.add(subset);
        }

        return result;
    }

    private Set<Set<Integer>> deepCopy(Set<Set<Integer>> set) {
        var copy = new HashSet<Set<Integer>>();
        for (var s : set) copy.add(new HashSet<>(s));
        return copy;
    }

    private Set<Set<Integer>> emptyPowerset() {
        return new HashSet<>() {{
            add(new HashSet<>());
        }};
    }

}
