

public class Player {
    private int bankedScore = 0;
    private int currentScore = 0;

    public void getBankedScore() {
        return bankedScore;
    }

    public int setBankedScore(int bankedScore) {
        this.bankedScore = bankedScore;
    }

    public void getCurrentScore() {
        return currentScore;
    }

    public int setCurrentScore(int currentScore) {
        this.currentScore = currentScore;
    }
}