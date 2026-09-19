class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mpp = new HashMap<>();

        int n = nums.length;

        for(int i=0;i<n;i++){
            int ele = nums[i];
            int more = target-ele;

            if(mpp.containsKey(more)){
                return new int[]{mpp.get(more), i};
            }
            mpp.put(ele, i);
        }
        return new int[]{-1, -1};
    }
}
