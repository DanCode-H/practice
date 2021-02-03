package learn_01;

public class Array {
    public static void main(String[] args) {
        //动态初始化
        //格式:数据类型[] 变量名 = new 数据类型[数组长度];
        int[] arr = new int[3];

        //输出数组名
        System.out.println(arr);

        //输出数组元素
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        //静态初始化
        //格式:数据类型 [] 变量名 = new 数据类型[] {数据1，数据2，数据3，……};
        //简化格式: 数据类型 [] 变量名 = {数据1，数据2，数据3，……};
        int[] arr1 = {1, 2, 3};
        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);

        //获取数组长度
        //格式:数组名.length
        for (int j=0;j<=arr1.length;j++) {
            if(j == arr.length)
                System.out.println("arr1.length="+j);
        }

        //取最值
        //1.定义一个变量；2取数组第一个值为变量初始值；3与数组中剩余数据逐个比较
        int max = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (max <= arr1[i]) {
                max = arr1[i];
            }
        }
        System.out.println("max:" + max);
    }
}
