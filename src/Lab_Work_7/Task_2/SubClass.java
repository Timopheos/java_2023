package Lab_Work_7.Task_2;

public class SubClass extends SuperClass {

    public int int1;
    public String str1;

    @Override
    public String getStr() {
        return super.getStr();
    }


    @Override
    public void setStr(String str) {
        super.setStr(str);
    }


    public int getInt1(int x) {
        return int1 = x;
    }

    public int getInt1() {
        return int1;
    }

    public void res(String str, int x) {
        super.setStr(str);
        getInt1(x);
    }

    public SubClass(String str, int x) {
        super(str);
        this.int1 = x;
    }


}
