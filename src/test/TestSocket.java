package test;
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class TestSocket {
 
    public static void main(String[] args) throws IOException {
 
        Process p = Runtime.getRuntime().exec("ping " + "192.168.50.186");
        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream(),"GB2312"));
        String line = null;
        StringBuilder sb = new StringBuilder();
        while ((line = br.readLine()) != null) {
            if (line.length() != 0)
                sb.append(line + "\r\n");
        }
        System.out.println("本次指令返回的消息是：");
        System.out.println(sb.toString());
    }
 
}