package stringFormatting;

public class Main{

    public static void main(String[] args) {
        
        String bulletIt = "Print a Bulleted List:\n" +
        "\t\u2022 First Point \n" +
        "\t\t\u2022 Sub Point";

        System.out.println(bulletIt);



        String textBlock = """
                Print a Bulleted List:
                            \u2022 First point
                                \u2022 Sub Point """;
        System.out.println(textBlock);

    }

    //         \t        insert a tab character.
    //         \n        insert a new line character.
    //         \"        insert a double quote character.
    //         \\        insert a backlash character.
}