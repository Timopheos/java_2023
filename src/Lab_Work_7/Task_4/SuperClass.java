package Lab_Work_7.Task_4;

public class SuperClass {
    public char ch1;

    public SuperClass(char A) {
        this.ch1 = A;
    }

    public SuperClass(SuperClass superClass) {
        this.ch1 = superClass.ch1;
    }

    public char getCh1() {
        return ch1;
    }

    public SuperClass copySuperClass(char ch2) {
        SuperClass copySuperClass = new SuperClass(ch2);
        copySuperClass.ch1 = this.ch1;
        return copySuperClass;
    }

    @Override
    public String toString() {
        String FieldValue;
        FieldValue =
                " ch 1 = " + this.getCh1() + "\n";

        return FieldValue;
    }

}
