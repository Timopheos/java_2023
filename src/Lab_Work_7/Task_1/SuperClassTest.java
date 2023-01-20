package Lab_Work_7.Task_1;

public class SuperClassTest {

    private String str1;

    SuperClassTest(String strEx) {
        this.str1 = strEx;
    }

    SuperClassTest() {
    }

    @Override
    public String toString(){
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "super" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " str 1 = " + this.getStr1();

        return superClassNameAndFieldValue;
    }

    public String getStr1() {
        return str1;
    }
    public void setStr1(String str1) {
        this.str1 = str1;
    }

}
