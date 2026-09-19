class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mpp = new HashMap<>();

        for(String str:strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);

            String key = new String(arr);

            if(!mpp.containsKey(key)){
                mpp.put(key, new ArrayList<>());
            }
            mpp.get(key).add(str);
        }
        return new ArrayList<>(mpp.values());
    }
}
