package Lab_Work_7.Task_3;

public class SubClass extends SuperClass {

    public char ch1;

    public SubClass(int x, char ch2) {
        super(x);
        this.ch1 = ch2;
    }


    public void setAll(int x, char ch2) {
        this.int1 = x;
        this.ch1 = ch2;
    }

    public char getCh1() {
        return ch1;
    }

    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "sub" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " int 1 = " + getInt1() + "\n" +
                " ch 1 = " + this.getCh1();

        return ClassNameAndFieldValue;

    }


}
