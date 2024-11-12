import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Powerset {

  public Set<Set<Integer>> recursive(List<Integer> input) {
    if (input.isEmpty())
      return new HashSet<>() {{ 
        add(new HashSet<>());
      }};

    var result = recursive(input.subList(1, input.size()));
    var copy   = deepCopy(result);

    copy.forEach(l -> l.add(input.getFirst()));
    
    result.addAll(copy);
    return result;
  }

  private Set<Set<Integer>> deepCopy(Set<Set<Integer>> set) {
    var copy = new HashSet<Set<Integer>>();
    for (var s : set) copy.add(new HashSet<>(s));
    return copy;
  }

}
