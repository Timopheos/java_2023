package Lab_Work_7.Task_5;

public class SubClass2 extends SuperClass {

    protected char ch1;

    public SubClass2(String str2, char ch1) {
        super(str2);
        this.ch1 = ch1;
    }

    @Override
    public void info1() {
        super.info1();
        System.out.println("ch 1 = " + ch1);
    }
}
