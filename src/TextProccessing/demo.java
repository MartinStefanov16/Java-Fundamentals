package TextProccessing;

import java.awt.*;

public class demo {
    public static void main(String[] args) {

        String key = "my";
        String word = "hello my name is marty";
        word = word.replace(key, "*");
        System.out.println(word);

        //System.out.println(word.replace(key, "*"));




    }
}
