import java.util.*;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();

        for (int num = left; num <= right; num++) {
            int temp = num;
            boolean isValid = true;

            while (temp > 0) {
                int digit = temp % 10;

                //A number containing 0 is not self-dividing
                if (digit == 0 || num % digit != 0) {
                    isValid = false;
                    break;
                }

                temp /= 10;
            }

            if (isValid) {
                result.add(num);
            }
        }

        return result;
    }
}