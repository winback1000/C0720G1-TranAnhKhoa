package _08_refactoring_n_clean_code.exercise.src;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TennisGameTest implements Collection {

    public int player1Score;
    public int player2Score;
    public String expectedScore;

    public TennisGameTest(int player1Score, int player2Score, String expectedScore) {
        this.player1Score = player1Score;
        this.player2Score = player2Score;
        this.expectedScore = expectedScore;
    }

    @Override
    @Test
    public void checkAllScores() {
        int highestScore = Math.max(this.player1Score, this.player2Score);
        int player1MaxScore = 0;
        int player2MaxScore = 0;
        for (int i = 0; i < highestScore; i++) {
            if (i < this.player1Score)
                player1MaxScore += 1;
            if (i < this.player2Score)
                player2MaxScore += 1;
        }
        assertEquals(this.expectedScore, TennisGame.getScore(player1MaxScore, player2MaxScore));
    }
}