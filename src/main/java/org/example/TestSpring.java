package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
//
//        System.out.println(classicalMusic.getSong());


         Music music = context.getBean("rockMusic", Music.class);

         MusicPlayer musicPlayer = new MusicPlayer(music);

         Music music2 = context.getBean("classicalMusic", Music.class);

         MusicPlayer classicalMusicPlayer = new MusicPlayer(music2);

//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        boolean comprassion = firstMusicPlayer == secondMusicPlayer;
//
//        System.out.println(comprassion);
//
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//
//        firstMusicPlayer.setVolume(10);
//
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());

         musicPlayer.playMusic();

         classicalMusicPlayer.playMusic();

        // System.out.println(musicPlayer.getName());

        // System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
