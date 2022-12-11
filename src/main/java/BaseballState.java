import java.util.Arrays;

public enum BaseballState{

    STRIKE(JudgeType.StrikeOrCorrect),
    BALL(JudgeType.BallOrOut);

    private final JudgeType judgeType;
    BaseballState(JudgeType judgeType){
        this.judgeType = judgeType;
    }

    public String call(String[] answer,String[] guess){
        return judgeType.judge(answer,guess);
    }

    enum JudgeType{
        StrikeOrCorrect {
            @Override
            String judge(String[] answer,String[] guess){
                int cnt = 0;
                for(int i = 0; i < answer.length; i++){
                    if(answer[i].equals(guess[i])) {
                        cnt += 1; }
                    }
                if (cnt == answer.length) { return "맞았습니다."; } // correct
                String strike_num = Integer.toString(cnt);
                return strike_num + "스트라이크";
            }
        },

        BallOrOut{
            @Override
            String judge(String[] answer,String[] guess) {
                int cnt = 0;
                for(int i = 0; i < answer.length; i++){
                    for(int j = 0; j < answer.length; j++){
                        if (i != j && answer[i].equals(guess[j])){

                            cnt += 1;}
                    }
                }
                if (cnt == 0) { return "아웃";} // out
                String ball_num = Integer.toString(cnt);
                return ball_num + "볼";
            }
        };
        abstract String judge(String[] answer,String[] guess);

    }

}
