package de.webtuples;

public class UltimateQuestion {

    public static void main(final String[] args) {

        System.out.println(getUltimateQuestion(42));
    }

























    private static String getUltimateQuestion(int i) {
        String question;
        if (temp + i == 42)
            question = "What do you get when you multiply six by nine";
        else
            question = "I don't know";
        temp = i;
        return question;
    }
    static int temp = 0;
}