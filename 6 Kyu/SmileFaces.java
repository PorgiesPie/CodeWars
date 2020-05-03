// Given an array (arr) as an argument complete the function countSmileys that should return the total number of smiling faces.
// Rules for a smiling face:
// -Each smiley face must contain a valid pair of eyes. Eyes can be marked as : or ;
// -A smiley face can have a nose but it does not have to. Valid characters for a nose are - or ~
// -Every smiling face must have a smiling mouth that should be marked with either ) or D.
// No additional characters are allowed except for those mentioned.
// Valid smiley face examples:
// :) :D ;-D :~)
// Invalid smiley faces:
// ;( :> :} :]

import java.util.*;

public class SmileFaces {

    public static int countSmileys(List<String> arr) {
        int result = 0;
        boolean eyes = false;
        boolean nose = false;
        boolean mouth = false;
        boolean valid = false;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).contains(":")){eyes = true;}
            if (arr.get(i).contains(";")){eyes = true;}
            if (arr.get(i).contains("~")){nose = true;}
            if (arr.get(i).contains("-")){nose = true;}
            if (arr.get(i).contains(")")){mouth = true;}
            if (arr.get(i).contains("D")){mouth = true;}

            if (arr.get(i).length() == 3){
                if (arr.get(i).charAt(0) == ';' || arr.get(i).charAt(0) == ':' && arr.get(i).charAt(1) == '~' || arr.get(i).charAt(1) == '-'){valid = true;}
                if (eyes && nose && mouth && valid){
                    result++;
                }
            } else if (arr.get(i).length() == 2){
                if (arr.get(i).charAt(0) == ';' || arr.get(i).charAt(0) == ':'){valid = true;}
                if (eyes && mouth && valid){
                    result++;
                }
            }

            eyes = false;
            nose = false;
            mouth = false;
            valid = false;
        }

        return result;

    }
}
