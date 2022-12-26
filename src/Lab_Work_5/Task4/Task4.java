package Lab_Work_5.Task4;

public class Task4 {

    private char ch;
    private int in;


    public Task4 (char ch, int in) {
        this.ch = ch;
        this.in = in;
    }

    public char getCh() {
        return ch;
    }


    public int getIn() {
        return in;
    }


    //вторая версия

    private char ch2;

    private int in2;

    private double dou;

    private int x;

    private double y;

    public Task4 (double dou) {
        this.dou = dou;
        this.x = (int) dou;
        this.ch2 = (char) x;
        this.y = (dou - x) * 100;
        this.in2 = (int) y;
    }

    public char getCh2() {
        return ch2;
    }

    public int getIn2() {
        return in2;
    }



}
