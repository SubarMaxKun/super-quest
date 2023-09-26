/* (C)2023 */
package com.shevliakov.superquest.logic;

import com.shevliakov.superquest.entity.Image;
import com.shevliakov.superquest.entity.Story;
import java.util.List;
import java.util.Scanner;

public class StartGame {
    CheckAnswer checkAnswer = new CheckAnswer();
    Scanner scanner = new Scanner(System.in);

    public void startGame(List<Story> stories, List<Image> images) {
        System.out.println(images.get(2).getImageText());
        System.out.println(stories.get(0).getDialog());
        System.out.println(stories.get(0).getOptions().replace('|', '\t'));

        if (checkAnswer.checkAnswer(
                scanner.nextLine(),
                stories.get(0).getOptions(),
                stories.get(0).getCorrectOption())) {
            System.out.println(stories.get(1).getDialog());
            System.out.println(stories.get(1).getOptions().replace('|', '\t'));
            if (checkAnswer.checkAnswer(
                    scanner.nextLine(),
                    stories.get(1).getOptions(),
                    stories.get(1).getCorrectOption())) {
                System.out.println(stories.get(2).getDialog());
                System.out.println(stories.get(2).getOptions().replace('|', '\t'));
                if (checkAnswer.checkAnswer(
                        scanner.nextLine(),
                        stories.get(2).getOptions(),
                        stories.get(2).getCorrectOption())) {
                    System.out.println(stories.get(3).getDialog());
                    System.out.println(stories.get(3).getOptions().replace('|', '\t'));
                    if (checkAnswer.checkAnswer(
                            scanner.nextLine(),
                            stories.get(3).getOptions(),
                            stories.get(3).getCorrectOption())) {
                        System.out.println(stories.get(4).getDialog());
                        System.out.println(stories.get(4).getOptions().replace('|', '\t'));
                        if (checkAnswer.checkAnswer(
                                scanner.nextLine(),
                                stories.get(4).getOptions(),
                                stories.get(4).getCorrectOption())) {
                            System.out.println(stories.get(5).getDialog());
                            System.out.println(stories.get(5).getOptions().replace('|', '\t'));
                            if (checkAnswer.checkAnswer(
                                    scanner.nextLine(),
                                    stories.get(5).getOptions(),
                                    stories.get(5).getCorrectOption())) {
                                System.out.println("Ви пройшли гру!");
                            } else {
                                System.out.println(images.get(1).getImageText());
                            }
                        } else {
                            System.out.println(images.get(1).getImageText());
                        }
                    } else {
                        System.out.println(images.get(1).getImageText());
                    }
                } else {
                    System.out.println(images.get(1).getImageText());
                }
            } else {
                System.out.println(images.get(1).getImageText());
            }
        } else {
            System.out.println(images.get(1).getImageText());
        }
    }
}
