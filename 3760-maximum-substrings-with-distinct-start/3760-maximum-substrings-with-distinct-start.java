class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> set = new HashSet<>();
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!(set.contains(ch))) {
                set.add(ch);
                c++;
            }
        }
        return c;
    }
}