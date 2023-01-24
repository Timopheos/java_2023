package Lab_Work_7.Task_4;

public class SubClass extends SuperClass {
    public String str1;

    public SubClass(char A, String str2) {
        super(A);
        this.str1 = str2;
    }

    public String getStr1() {
        return str1;
    }

    public SubClass copySubClass(char ch1, String str1) {
        SubClass copySubClass = new SubClass(ch1, str1);
        copySubClass.ch1 = this.ch1;
        copySubClass.str1 = this.str1;
        return copySubClass;
    }

    @Override
    public String toString() {
        String FieldValue;
        FieldValue =
                " ch 1 = " + this.getCh1() + "\n" +
                        " str 1 = " + this.getStr1();

        return FieldValue;
    }
}
