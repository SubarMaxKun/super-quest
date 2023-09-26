/* (C)2023 */
package com.shevliakov.superquest;

import com.shevliakov.superquest.dao.impl.ImageImpl;
import com.shevliakov.superquest.dao.impl.StoryImpl;
import com.shevliakov.superquest.entity.Image;
import com.shevliakov.superquest.entity.Story;
import com.shevliakov.superquest.logic.StartGame;
import java.util.List;

public class Main {

    List<Story> stories;
    List<Image> images;

    public static void main(String[] args) {
        Main main = new Main();
        main.initElements();

        StartGame startGame = new StartGame();
        startGame.startGame(main.stories, main.images);
    }

    private void initElements() {
        try {
            ImageImpl imageImpl = new ImageImpl();
            images = imageImpl.getAll();
            StoryImpl storyImpl = new StoryImpl();
            stories = storyImpl.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
