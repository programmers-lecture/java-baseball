package model;

import java.util.Arrays;

public enum JudgeCount implements Judgement{
    CORRECT {
        @Override
        public int judge(String[] answer, String[] guess){
            int cnt = 0;
            for(int i = 0; i < answer.length; i++){
                if(answer[i].equals(guess[i])) {
                    cnt += 1; }
            }
            if (cnt == 3){return 1;}
            return 0;
        }
    },
    STRIKE {
        @Override
        public int judge(String[] answer,String[] guess){
            int cnt = 0;
            for(int i = 0; i < answer.length; i++){
                if(answer[i].equals(guess[i])) {
                    cnt += 1; }
            }
            return cnt;
        }
    },
    BALL {
        @Override
        public int judge(String[] answer, String[] guess) {
            int cnt = 0;
            for (int i = 0; i < answer.length; i++) {
                for (int j = 0; j < answer.length; j++) {
                    if (i != j && answer[i].equals(guess[j])) {
                        cnt += 1;
                    }
                }
            }
            return cnt;
        }
    };

    JudgeCount() {
    }

}

