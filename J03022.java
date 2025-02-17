import java.util.*;

public class J03022 {
    private static String chuanHoa(String s, boolean dauCau) {
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < s.length(); i++){
            sb.append(Character.toLowerCase(s.charAt(i)));
        }
        if(dauCau) sb.insert(0, Character.toUpperCase(s.charAt(0)));
        else sb.insert(0, Character.toLowerCase(s.charAt(0)));
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        boolean firstWord = true;
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            StringTokenizer stn = new StringTokenizer(s);
            while(stn.hasMoreTokens()){
                String a = stn.nextToken();
                char end = a.charAt(a.length() - 1);
                if(end == '.' || end == '?' || end == '!'){
                    StringBuilder sb = new StringBuilder(a);
                    sb.deleteCharAt(sb.length() - 1);
                    a = sb.toString();
                    System.out.println(chuanHoa(a, firstWord));
                    firstWord = true;
                }
                else{
                    System.out.print(chuanHoa(a, firstWord) + " ");
                    firstWord = false;
                }
            }
        }
        sc.close();
    }
}
