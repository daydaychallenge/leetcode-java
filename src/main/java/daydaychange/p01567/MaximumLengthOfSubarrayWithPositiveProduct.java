package daydaychange.p01567;

public class MaximumLengthOfSubarrayWithPositiveProduct {

    public static void main(String[] args) {
        int[] nums = new int[]{5,-20,-20,-39,-5,0,0,0,36,-32,0,-7,-10,-7,21,20,-12,-34,26,2};
        int r = getMaxLen(nums);
        System.out.println(r);
    }

    public static int getMaxLen(int[] nums) {
        int len = nums.length;
        int i=0;
        int result=0;
        while(i<len) {
            int start=i;
            int negatives=0;
            int firstNegative = -1;
            int lastNegative = -1;
            while(i<len && nums[i]!=0) {
                if(nums[i]<0) {
                    if(firstNegative<0) firstNegative = i;
                    lastNegative = i;
                    negatives++;
                }
                i++;
            }
            int currMaxLen=0;
            if(negatives%2==0) currMaxLen = i-start;
            else {
                currMaxLen = Math.max(firstNegative-start, Math.max(i-firstNegative-1, Math.max(i-lastNegative-1, lastNegative-start)));
            }
            result = Math.max(result, currMaxLen);
            if(i<len && nums[i]==0) i++;
        }

        return result;
    }

}
