class Solution {
    public int solution(int hp) {
        int totalAnt = 0;
        totalAnt += hp / 5;
        hp %= 5;

        totalAnt += hp / 3;
        hp %= 3;

        totalAnt += hp;

        return totalAnt;
    }
}
