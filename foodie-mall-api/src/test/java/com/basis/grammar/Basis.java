// #### java数组
// ```java
import java.util.Arrays;

public class Basis {
    public static void main(String[] args) {
        try {
            process1();
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        int a = 1111;
        int b = 2222;
        System.out.printf("变量a%d, 变量b%d",a,b);    //通过占位符，打印多个变量
        // %c        单个字符 
        // %d        十进制整数 
        // %f        十进制浮点数 
        // %o        八进制数 
        // %s        字符串 
        // %u        无符号十进制数 
        // %x        十六进制数 
        // %%        输出百分号% 
        int[] ns = { 1, 1, 2, 3, 5, 8 };
        System.out.println(Arrays.toString(ns)); // 类似 [I@7852e922 (JVM中的引用地址)
    }

    static void process1() {
        process2();
    }
    static void process2() {
        Integer.parseInt(null); // 会抛出NumberFormatException
    }
}
// ```

