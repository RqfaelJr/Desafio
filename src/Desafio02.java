public class Desafio02 {

    static String VerificaLetraA(String string) {
        var stringMinuscula = string.toLowerCase();
        var count = 0;
        if (stringMinuscula.contains("a")) {
            for (int i = 0; i < string.length(); i++) {
                if (stringMinuscula.charAt(i) == 'a') {
                    count++;
                }
            }
            return STR."A palavra '\{string}' contém: \{count} 'a' ";
        }
        return STR."Não há 'a' na palavra '\{string}'";


    }
    public static void main(String[] args) {


        // Não contém letra "a"
        System.out.println(VerificaLetraA("teste"));

        // Contém 3 "a"
        System.out.println(VerificaLetraA("palavra"));
    }
}