package Lab_Work_7.Task_5;

public class SubClass extends SuperClass {

    protected int int1;

    public SubClass(String str2, int int1) {
        super(str2);
        this.int1 = int1;
    }

    @Override
    public void info1() {
        super.info1();
        System.out.println("int 1 = " + int1);
    }
}
