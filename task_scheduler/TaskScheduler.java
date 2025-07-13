import java.util.Comparator;
import java.util.HashMap;
import java.util.Optional;
import java.util.PriorityQueue;

class TaskScheduler {

    public int leastInterval(char[] tasks, int n) {

        var frequencies = new HashMap<Character, Integer>();
        var intervalToFrequencyMap = new HashMap<Integer, Integer>();
        var queue = new PriorityQueue<Integer>(Comparator.reverseOrder());

        for (char t : tasks)
            frequencies.put(t, frequencies.getOrDefault(t, 0) + 1);

        queue.addAll(frequencies.values());

        var idles = 0;
        var currentInterval = 1;
        var tasksToBeScheduled = tasks.length;

        while (tasksToBeScheduled > 0) {
            Optional.ofNullable(intervalToFrequencyMap.remove(currentInterval))
                    .ifPresent(queue::add);

            var frequency = queue.poll();
            if (frequency != null) {
                tasksToBeScheduled--;
                if (--frequency > 0) {
                    var nextInterval = currentInterval + n + 1;
                    intervalToFrequencyMap.put(nextInterval, frequency);
                }
            } else
                idles++;

            currentInterval++;
        }

        return tasks.length + idles;
    }

}