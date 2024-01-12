package Lists_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 4, 4, 1));

        int numer = 4;
        nums.remove(Integer.valueOf(numer));

        System.out.println(nums);
    }
}
