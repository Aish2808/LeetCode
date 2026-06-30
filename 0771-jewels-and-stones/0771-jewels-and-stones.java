class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        // for (int i = 0; i < stones.length(); i++) {
        //     char ch = stones.charAt(i);
        //     String s = Character.toString(ch);
        //     if (jewels.contains(s)) {
        //         count++;
        //     }
        // }
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < jewels.length(); i++) {
            set.add(jewels.charAt(i));
        }
        for (int i = 0; i < stones.length(); i++) {
            char ch = stones.charAt(i);
            if (set.contains(ch)) {
                count++;
            }
        }
        return count;
    }
}