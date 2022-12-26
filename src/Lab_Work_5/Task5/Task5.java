package Lab_Work_5.Task5;

public class Task5 {

    public int getIn() {
        return In;
    }

    public void setIn() {
        In = 0;
    }


    public void setIn(int q) {
        if (q >= 100){
            In = 100;
        }else In = q;
    }

    private int In;

    public Task5 (){
    }

    public Task5 (int x){
        if (x >= 100){
            In = 100;
        }else In = x;
    }

}
