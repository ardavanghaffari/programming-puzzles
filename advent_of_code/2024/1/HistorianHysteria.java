import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.google.common.collect.Streams;

class HistorianHysteria {

    public int totalDistance() {
        var p = parse(input());
        var left  = p.leftList();
        var right = p.rightList();

        left.sort(null);
        right.sort(null);

        return Streams.zip(left.stream(), right.stream(), (l, r) -> Math.abs(l - r))
                .mapToInt(Integer::intValue)
                .sum();
    }

    public long similarityScore() {
        var p = parse(input());
        var left  = p.leftList();
        var right = p.rightList();

        var count = right.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return left.stream()
                .map(n -> n * count.getOrDefault(n, 0L))
                .reduce(0L, Long::sum);
    }

    private static record P(List<Integer> leftList, List<Integer> rightList) {}

    private P parse(List<String> lines) {
        var left  = new ArrayList<Integer>();
        var right = new ArrayList<Integer>();

        lines.forEach(line -> {
            var numbers = line.split("\\s+");
            left.add(Integer.valueOf(numbers[0]));
            right.add(Integer.valueOf(numbers[1]));
        });

        return new P(left, right);
    }

    private List<String> input() {
        try {
            return Files.readAllLines(Paths.get("input"));
        } catch (IOException e) {
            throw new RuntimeException("Error reading puzzle input", e);
        }
    }

}