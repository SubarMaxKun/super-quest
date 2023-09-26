/* (C)2023 */
package com.shevliakov.superquest.logic;

public class CheckAnswer {
    public boolean checkAnswer(String answer, String options, String correctOption) {
        String[] optionsArray = options.split("\\|");
        for (String s : optionsArray) {
            if (answer.equals(s) && correctOption.equals(answer)) {
                return true;
            }
        }
        return false;
    }
}
