package learn_01;

/*
    数组遍历:
    需求:
        设计一个方法用于数组遍历，要求遍历的结果是在一行上的。例如:[11,22,33,44]
*/
public class Case {
    public static void main(String[] args) {
        //定义数组
        int[] arr = new int[]{1, 2, 3, 4, 5};
        traversal(arr);
    }

    //遍历数组
    public static void traversal(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.print("]");
    }
}
