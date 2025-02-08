package Strings;

public class Str {

    public static boolean isPali(String str){

        for(int i=0,j=str.length()-1;i<j;i++,j--){

            if(str.charAt(i) != str.charAt(j)){
                System.out.println("NO");
                return false;
            }

        }
        System.out.println("YES");
        return true;
    } 

    public static void anag(String str,String str2){
        System.out.println(str.compareTo(str2));
    }
    public static void main(String[] args) {
        System.out.println(isPali("abacba"));
        anag("naga", "gana");
    }
}
