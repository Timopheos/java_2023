package Lab_Work_7.Task_2;

public class SuperClass {

    private String str;

    public void setStr(String str) {
        this.str = str;
    }

    public SuperClass(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public int getStringLength() {
        if (null == this.str) {
            return 0;
        }
        return this.str.length();
    }

    @Override
    public String toString() {
        String info;
        info = this.getStr();

        return info;
    }


}
