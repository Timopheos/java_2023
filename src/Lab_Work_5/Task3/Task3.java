package Lab_Work_5.Task3;

public class Task3 {

    public int getNum1() {
        return Num1;
    }

    public void setNum1(int num1) {
        Num1 = num1;
    }

    public int getNum2() {
        return Num2;
    }

    public void setNum2(int num2) {
        Num2 = num2;
    }

    private int Num1;
    private int Num2;

    public Task3(){

    }
    public Task3 (int Num1){
        this.Num1 = Num1;
    }

    public Task3 (int Num1 , int Num2) {
        this.Num1 = Num1;
        this.Num2 = Num2;
    }



}
