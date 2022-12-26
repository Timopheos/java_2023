package Lab_Work_5.Task6;

public class Task6 {

    private int max;
    private int min;

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public void setEx1(int x) {
        if (x > min) {
            max = x;
        }else min = x;
    }

    public void setEx2(int x, int y) {
        if (x > y) {
            max = x;
            min = y;
        } else {
            max = y;
            min = x;
        }

    }

    public Task6 (){
    }

    public Task6 (int x, int y){
        if (x > y) {
            max = x;
            min = y;
        } else {
            max = y;
            min = x;
        }
    }
}
