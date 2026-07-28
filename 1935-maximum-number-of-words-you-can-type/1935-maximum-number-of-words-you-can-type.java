class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] s = text.split(" ");
        int c = 0;
        for (String w : s) {
            boolean type = true;
            for (int i = 0; i < w.length(); i++) {
                if (brokenLetters.indexOf(w.charAt(i)) != -1) {
                    type = false;
                    break;
                }
            }
            if (type) {
                c++;
            }
        }
        return c;
    }
}