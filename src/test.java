import javax.management.StringValueExp;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String name="bugun hava cok guzel";
        String []arr=name.split(" ");

        System.out.println(Arrays.toString(arr));
        System.out.println(name);
        StringBuilder sb=new StringBuilder(name);
        sb.reverse();
        System.out.println(sb);
    }
}
