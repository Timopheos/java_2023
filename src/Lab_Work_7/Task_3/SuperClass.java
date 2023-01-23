package Lab_Work_7.Task_3;

public class SuperClass {

    public int int1;

    public void setAll(int x) {
        this.int1 = x;
    }
    public SuperClass(int x){
        this.int1 = x;
    }

    public int getInt1() {
        return int1;
    }

    @Override
    public String toString(){
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "super " +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " int 1 = " + this.getInt1();

        return superClassNameAndFieldValue;
    }
}
