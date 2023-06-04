import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {

    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);

        try (BufferedReader fileReader = new BufferedReader(new FileReader(file))) {

            List<Integer> collect = fileReader.lines()
                    .map(Integer::valueOf)
                    .sorted()
                    .collect(Collectors.toList());
            Integer[] nums = collect.toArray(new Integer[0]);
            int median = 0;
            if (nums.length % 2 != 0) {
                median = nums[nums.length / 2];
            } else {
                median = (int) Math.round((nums[(nums.length / 2) - 1] + nums[(nums.length / 2)]) / 2.0);
            }
            int result = 0;
            for (int i =0; i < nums.length; i++) {
                result = result + Math.abs(nums[i] - median);
            };
            System.out.println(result);
        }
    }
}