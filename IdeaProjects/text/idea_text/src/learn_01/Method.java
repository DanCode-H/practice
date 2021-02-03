package learn_01;

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        //调用方法
        isEvenNumber();
        //调用常量
        isEvenNumber1(5);
        //调用变量
        int number1 = 10;
        isEvenNumber1(number1);
        //带返回值方法调用
        //格式:1,方法名(参数);2,数据类型 变量名=方法名(参数);
        //isEvenNumber2(3);
        boolean flag = isEvenNumber2(5);
        System.out.println(flag);
    }

    //方法
    //需求:定义一个方法，在方法中定义一个变量，判断该数据是否是偶数
    public static void isEvenNumber() {
        int number;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        if (number % 2 == 0)
            System.out.println("是偶数");
        else
            System.out.println("不是偶数");
    }

    //带参方法
    //格式:public static void 方法名(参数){……}
    //格式:public static void 方法名 (数据类型 变量名){……}
    public static void isEvenNumber1(int number1) {
        if (number1 % 2 == 0)
            System.out.println("是偶数");
        else
            System.out.println("不是偶数");
    }

    //带返回值方法
    //格式:public static 数据类型   方法名(参数){
    //      return 数据;
    // }
    //定义一个方法，该方法接收一个参数，并判断是否为偶数，并返回真假值
    public static boolean isEvenNumber2(int number2) {
        return number2 % 2 == 0;
    }
}
