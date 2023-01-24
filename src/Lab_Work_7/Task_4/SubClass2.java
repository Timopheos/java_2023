package Lab_Work_7.Task_4;

public class SubClass2 extends SubClass {

    public int int1;

    public SubClass2(char A, String str2, int int2) {
        super(A, str2);
        this.int1 = int2;
    }

    public int getInt1() {
        return int1;
    }

    public SubClass2 copySubClass2(char ch1, String str1, int int1) {
        SubClass2 copySubClass2 = new SubClass2(ch1, str1, int1);
        copySubClass2.ch1 = this.ch1;
        copySubClass2.str1 = this.str1;
        copySubClass2.int1 = this.int1;
        return copySubClass2;
    }

    @Override
    public String toString() {
        String FieldValue;
        FieldValue =
                " ch 1 = " + this.getCh1() + "\n" +
                        " str 1 = " + this.getStr1() + "\n" +
                        " int 1 = " + this.getInt1();

        return FieldValue;
    }
}
