package com.rabraham.patterns.structural.adapter.impl;

import com.rabraham.patterns.structural.adapter.AdvancedMediaPlayer;
import com.rabraham.patterns.structural.adapter.MediaPlayer;
import org.apache.commons.lang3.StringUtils;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType){

        if(StringUtils.equalsIgnoreCase(audioType, "vlc")){
            advancedMusicPlayer = new VlcPlayer();

        }else if (StringUtils.equalsIgnoreCase(audioType, "mp4")){
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(StringUtils.equalsIgnoreCase(audioType, "vlc")){
            advancedMusicPlayer.playVlc(fileName);
        }
        else if(StringUtils.equalsIgnoreCase(audioType, "mp4")){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
