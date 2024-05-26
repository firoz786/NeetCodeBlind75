import java.util.HashSet;

class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hashset = new HashSet<>();

        for(Integer num: nums) {
            if(hashset.contains(num)) {
                return true;
            } else {
                hashset.add(num);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 3};
        System.out.println(solution.hasDuplicate(nums));
    }
}
