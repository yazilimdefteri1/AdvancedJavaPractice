package _05_StringManipulation;

public class Q11 {
    public static void main(String[] args) {
	/*  TASK :
		Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 */

        String pickName="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //kendi çözümüm
        int a=pickName.indexOf("A");
        int l=pickName.indexOf("L");
        int i=pickName.indexOf("I");

        System.out.println(pickName.substring(a,++a) + pickName.substring(l,++l) +pickName.substring(i,++i));

        //hocanin çözümü
        char aA =pickName.charAt(pickName.indexOf("A"));
        char lL =pickName.charAt(pickName.indexOf("L"));
        char iI =pickName.charAt(pickName.indexOf("I"));
        System.out.println(""+aA+lL+iI);





    }

}
