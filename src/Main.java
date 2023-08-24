import javax.xml.transform.Result;
public class Main {
    public static void main(String[] args) {
        int result =6;
        int B=1, C=7;
        if (B > result) {
            result = B;
        }
        else if (C > result) {
            result = C;
        }
        else{
            System.out.println(result);
        }
        System.out.println(result);
    }
}
