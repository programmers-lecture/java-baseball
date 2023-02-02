package baseball;

public class RandomNumber {
    private int[] number;

    public int[] getNumber() {
        return number;
    }
    public int[] random(){
        number = new int[3];

        for(int i = 0; i < 3; i++){
            this.number[i] = ((int)(Math.random() * 9) + 1);

            for(int j = 0; j < i; j++){
                if(number[i] == number[j]){
                    i--;
                    break;
                }
            }
        }
        return this.number;
    }
}