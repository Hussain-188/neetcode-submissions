class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;

        Map<Integer, Integer> mpp = new HashMap<>();
        for(int i=0;i<n;i++){
            mpp.put(nums[i], mpp.getOrDefault(nums[i],0)+1);
        }
        List<Integer> ls = new ArrayList<>(mpp.keySet());

        ls.sort((a, b)->Integer.compare(mpp.get(b), mpp.get(a)));

        int[] ans = new int[k];

        for(int i=0;i<k;i++){
            ans[i] = ls.get(i);
        }

        return ans;
    }
}
