package lambda3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lambda3 {
  static   List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
    public static void main(String[] args) {
        List<String>result=strings.stream().filter(string -> string.equals("bc")).collect(Collectors.toList());
        Integer index= IntStream.range(0, strings.size())
                .filter(userInd-> strings.get(userInd).equals("bc"))
                .findFirst().orElse(-1);
        System.out.println(index);
    }
}
