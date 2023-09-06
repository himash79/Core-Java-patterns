package lk.himash;

public class Illustration_03 {
    public static void main(String[] args) {

//       Write a program to reverse the below paragraph

        String word = "Hello My World";

        StringBuilder out = new StringBuilder(); // method 01
        char[] charArr = word.toCharArray();
        for(int i = charArr.length - 1; i >= 0; i--) {
            out.append(charArr[i]);
        }
        System.out.println(out);

        StringBuilder strBuilder = new StringBuilder(word);// method 02
        System.out.println(strBuilder.reverse());

        StringBuffer strBuffer = new StringBuffer(word);// method 03
        System.out.println(strBuffer.reverse());
    }
}
