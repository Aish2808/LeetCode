class Solution {
    public int findPermutationDifference(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            hm.put(s.charAt(i), i);
        }
        int r = 0;
        for (int i = 0; i < t.length(); i++) {
            int j = hm.get(t.charAt(i));
            r += Math.abs(i - j);
        }
        return r;
    }
}