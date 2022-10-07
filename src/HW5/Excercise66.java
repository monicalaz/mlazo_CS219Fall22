package HW5;

public class Excercise66 {

    public static boolean canSpell(String word, String tiles){
        StringBuilder tileString = new StringBuilder(tiles.toLowerCase());
        word = word.toLowerCase();

        boolean check;
        for(int i=0;i<word.length();i++){
            check = false;
            for(int m=0;m<tileString.length();m++){
                if(word.charAt(i) == tileString.toString().charAt(m)){
                    tileString.deleteCharAt(m);
                    check = true;
                    break;
                }
            }
            if(!check)
                return false;
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println(canSpell("math" , "asthem"));
        System.out.println(canSpell("tob" , "bot"));
        System.out.println(canSpell("hippo" , "jbrsipho"));
        System.out.println(canSpell("quilt" , "qweunglti"));
        System.out.println(canSpell("rooga" , "kangaroo"));
        System.out.println(!canSpell("bapo", "haxobapsrito"));
        System.out.println(!canSpell("happy", "spphya"));
        System.out.println(!canSpell("happy", "uhatfy"));

    }
    }





