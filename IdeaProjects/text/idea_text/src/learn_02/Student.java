package learn_02;

/*
    学生类
    private关键字
        是一个权限修饰符
        可以修饰成员(成员变量和成员方法)
        作用是保护成员不被别的类使用，被private修饰的成员只有在本类中才能访问
*/
public class Student {
    //成员方法
    String name;
    //    int age;
    private int age;

    //提供get/set方法
    public void setAge(int a) {
        //age=a;
        if (a < 0 || a > 120) {
            System.out.println("你给的年龄有误");
        } else {
            age = a;
        }
    }

    public int getAge() {
        age = 2;
        return age;
    }

    //成员方法
    public void show() {
        System.out.println(name + "," + age);
    }
}
