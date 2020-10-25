package com.rabraham.patterns.structural.adapter.impl;

import com.rabraham.patterns.structural.adapter.MediaPlayer;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

@Slf4j
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        //inbuilt support to play mp3 music files
        if(StringUtils.equalsIgnoreCase(audioType, "mp3")){
            log.info("Playing mp3 file. Name: " + fileName);
        }

        //mediaAdapter is providing support to play other file formats
        else if(StringUtils.equalsIgnoreCase(audioType, "vlc") || StringUtils.equalsIgnoreCase(audioType, "mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }

        else{
            log.info("Invalid media. " + audioType + " format not supported");
        }
    }
}
