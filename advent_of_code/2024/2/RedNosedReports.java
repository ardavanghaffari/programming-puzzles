import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Stream;

class RedNosedReports {

    private static final BiPredicate<Integer, Integer> INCREASING =
            (i, j) -> -3 <= i - j && i - j <= -1;
    private static final BiPredicate<Integer, Integer> DECREASING =
            (i, j) -> 1 <= i - j && i - j <= 3;

    public long numberOfSafeReports() {
        return parse(input()).stream()
                .filter(this::isSafe)
                .count();
    }

    private boolean isSafe(List<Integer> report) {
        var i = report.get(0);
        var j = report.get(1);

        if (INCREASING.test(i, j))
            return isSafe(report, INCREASING);

        if (DECREASING.test(i, j))
            return isSafe(report, DECREASING);

        return false;
    }

    private boolean isSafe(List<Integer> report, BiPredicate<Integer, Integer> predicate) {
        for (int i = 1; i < report.size() - 1; i++)
            if (!predicate.test(report.get(i), report.get(i + 1)))
                return false;
        return true;
    }

    public long numberOfSafeReportsToleratingSingleBadLevel() {
        return parse(input()).stream()
                .filter(this::isSafeToleratingSingleBadLevel)
                .count();
    }

    private boolean isSafeToleratingSingleBadLevel(List<Integer> report) {
        return isSafeToleratingSingleBadLevel(report, INCREASING) ||
                isSafeToleratingSingleBadLevel(report, DECREASING);
    }

    private boolean isSafeToleratingSingleBadLevel(List<Integer> report,
                                                   BiPredicate<Integer, Integer> predicate) {

        int i = 0;
        int skips = 0;

        while (i <= report.size() - 2) {
            if (!predicate.test(report.get(i), report.get(i + 1))) {

                if (skips > 0)
                    return false;

                if (i == 0) {
                    if (predicate.test(report.get(0), report.get(2)) ||
                            predicate.test(report.get(1), report.get(2))) {
                        skips++; // skip either the first or the second number
                        i = 2;
                    } else
                        return false; // all first three numbers are unsafe w.r.t. each other
                } else if (i == report.size() - 2) {
                    return true; // last two numbers are unsafe with no prior skips
                } else if ((predicate.test(report.get(i - 1), report.get(i + 1))  &&
                            predicate.test(report.get(i + 1), report.get(i + 2))) || (
                            predicate.test(report.get(i - 1), report.get(i))      &&
                            predicate.test(report.get(i),     report.get(i + 2)))) {
                    skips++; // skip either i or i + 1
                    i += 2;
                } else
                    return false; // more than 1 number needs to be skipped to make the report safe
            } else
                i++;
        }

        return true;
    }

    private List<List<Integer>> parse(List<String> lines) {
        return lines.stream()
                .map(l -> Stream.of(l.split("\\s+"))
                        .map(Integer::valueOf)
                        .toList())
                .toList();
    }

    private List<String> input() {
        try {
            return Files.readAllLines(Paths.get("input"));
        } catch (IOException e) {
            throw new RuntimeException("Error reading puzzle input", e);
        }
    }

}