import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
    public int pivotIndex(int[] nums) {
    	int len = nums.length;
    	int sum =0, leftSum = 0;
    	for(int eleVal : nums) sum += eleVal;
    	for(int i=0; i<len ;i++) {
           if(leftSum == sum-nums[i]-leftSum) {
              return i;
    	   }
    	   leftSum += nums[i];
    	}
        return -1;
    }
}

public class PivotIndex {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
          return new int[0];
        }
    
        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] nums = stringToIntegerArray(line);
            
            int ret = new Solution().pivotIndex(nums);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
