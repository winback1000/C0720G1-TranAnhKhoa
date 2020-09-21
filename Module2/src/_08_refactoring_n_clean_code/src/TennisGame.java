package _08_refactoring_n_clean_code.exercise.src;


public class TennisGame {

    public static String getScore(int player1MaxScore, int player2MaxScore) {
        StringBuilder score = new StringBuilder();
        int tempScore;
        if (player1MaxScore == player2MaxScore) {
            switch (player1MaxScore) {
                case 0:
                    score = new StringBuilder("Love-All");
                    break;
                case 1:
                    score = new StringBuilder("Fifteen-All");
                    break;
                case 2:
                    score = new StringBuilder("Thirty-All");
                    break;
                case 3:
                    score = new StringBuilder("Forty-All");
                    break;
                default:
                    score = new StringBuilder("Deuce");
                    break;
            }
        }
        else if (player1MaxScore>=4 || player2MaxScore>=4) {
            int minusResult = player1MaxScore-player2MaxScore;
            if (minusResult==1) score = new StringBuilder("Advantage player1");
            else if (minusResult ==-1) score = new StringBuilder("Advantage player2");
            else if (minusResult>=2) score = new StringBuilder("Win for player1");
            else score = new StringBuilder("Win for player2");
        }
        else {
            for (int i=1; i<3; i++) {
                if (i==1) tempScore = player1MaxScore;
                else { score.append("-"); tempScore = player2MaxScore;}
                switch(tempScore)
                {
                    case 0:
                        score.append("Love");
                        break;
                    case 1:
                        score.append("Fifteen");
                        break;
                    case 2:
                        score.append("Thirty");
                        break;
                    case 3:
                        score.append("Forty");
                        break;
                }
            }
        }
        return score.toString();
    }
}
