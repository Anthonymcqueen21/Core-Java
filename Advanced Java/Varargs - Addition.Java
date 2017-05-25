import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;
class Add {
    void add(int... numbers) {
       StringBuilder sb = new StringBuilder();
       int sum = 0;
       for (int number : numbers) {
          if (sb.length() != 0) {
              sb.append("+");
          }
          sb.append(number);
          
          sum += number;
       }
       sb.append("=" + sum);
       System.out.println(sb);
    }
}
