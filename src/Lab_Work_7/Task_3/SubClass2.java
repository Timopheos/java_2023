package Lab_Work_7.Task_3;

public class SubClass2 extends SubClass {

    public String Str1;

    public SubClass2(int x, char ch2, String Str2) {
        super(x, ch2);
        this.Str1 = Str2;
    }

    public void setAll(int x, char ch2, String Str2) {
        this.int1 = x;
        this.ch1 = ch2;
        this.Str1 = Str2;
    }

    public String getStr1() {
        return Str1;
    }

    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "sub" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " int 1 = " + getInt1() + "\n" +
                " ch 1 = " + getCh1() + "\n" +
                " str 1 = " + this.getStr1();

        return ClassNameAndFieldValue;

    }
}
