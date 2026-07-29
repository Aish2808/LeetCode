class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("+")) {
                int ft = s.pop();
                int sd = s.peek();
                s.push(ft);
                s.push(ft + sd);
            } else if (operations[i].equals("D")) {
                int n = s.peek();
                s.push(n * 2);
            } else if (operations[i].equals("C")) {
                s.pop();
            } else {
                s.push(Integer.parseInt(operations[i]));
            }
        }
        int sum = 0;
        while (!s.isEmpty()) {
            sum += s.pop();
        }
        return sum;
    }
}