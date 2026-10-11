class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> a = new HashSet<>();
        char c = ' ';
        for (int i = 0; i < s.length(); i++) {
            if (a.contains(s.charAt(i))) {
                c = s.charAt(i);
                break;
            } else {
                a.add(s.charAt(i));
            }
        }
        return c;
    }
}