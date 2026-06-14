class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        long currMass = mass;
        Arrays.sort(asteroids);
        for(int i=0;i<asteroids.length;i++){
            if(currMass < asteroids[i]){
                return false;
            } else {
                currMass = currMass + asteroids[i];
            }
        }
        return true;
    }
}