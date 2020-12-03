#### java数组
```java
class Array () {
    
    public static void main(String[] args) {
        /**
        * 数组遍历
        */
        int[] ns = { 1, 4, 9, 16, 25 };
        for (int i=0; i<ns.length; i++) {
            int n = ns[i];
            System.out.println(n);
        }
        /**
        * for each遍历
        */
        for (int n : ns) {
            System.out.println(n);
        }
        /**
        * 数组打印
        */
        int[] ns = { 1, 1, 2, 3, 5, 8 };
        System.out.println(ns); // 类似 [I@7852e922 (JVM中的引用地址)

        for (int n : ns) {
            System.out.print(n + ", ");
        }
        
        System.out.print(Arrays.toString(ns));

        /**
        * 数组排序
        */
        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        // 排序前:
        System.out.println(Arrays.toString(ns));
        for (int i =0; i < ns.length; i++) {
            for (int j = 0; j < ns.length - i - 1; j++) {
                if (ns[j] > ns[j + 1]) {
                    ns[j] 和 ns[j + 1] // 交换位置
                    int tmp = ns[j];
                    ns[j] = ns[j+1];
                    ns[j+1] = tmp;
                }
            }
        }
    }
}
```