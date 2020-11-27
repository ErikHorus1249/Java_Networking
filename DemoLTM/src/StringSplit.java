//Thong ke so lan xuat hien cua cac ky tu
import java.util.ArrayList;

public class StringSplit {

    public static void main(String[] args){
        String  text = "abAacdMeaf";
        System.out.println(countCharactor(text));
    }

    public static String countCharactor(String text){
        int lenght =  text.length();
        String result = "";
        for(int i = 0; i < lenght; i++){
            boolean check = true;
            for(int j = i-1; j >= 0; j--){
                if(text.charAt(i) == text.charAt(j)) check = false;
            }
            int count = 0;
            if(check){
                for(int k = 0; k<lenght; k++){
                    if(text.charAt(k) == text.charAt(i)) count ++;
                }
//                System.out.println(text.charAt(i));
                result += text.charAt(i)+":"+count+",";
            }


        }
        return  result;
    }
}
