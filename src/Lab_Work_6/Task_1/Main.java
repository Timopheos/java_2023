package Lab_Work_6.Task_1;

public class Main {
    public static void main(String[] args) {

        Task_1 task_1 = new Task_1();
        task_1.setCh1Str1('l');
        task_1.setCh1Str1("Hello");

        System.out.println(task_1.ch1);
        System.out.println(task_1.str1);

        char[] chars1 = new char[7];
        chars1[0] = 'G';
        chars1[1] = 'o';
        chars1[2] = 'o';
        chars1[3] = 'd';
        chars1[4] = 'b';
        chars1[5] = 'y';
        chars1[6] = 'e';

        task_1.setCh1Str1(chars1);
        System.out.println(task_1.str1);

        char[] chars2 = new char[1];
        chars2[0] = 'W';
        task_1.setCh1Str1(chars2);
        System.out.println(task_1.ch1);

    }

}
