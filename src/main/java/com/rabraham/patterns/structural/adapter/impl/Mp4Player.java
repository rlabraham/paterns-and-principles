package com.rabraham.patterns.structural.adapter.impl;

import com.rabraham.patterns.structural.adapter.AdvancedMediaPlayer;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        //do nothing
    }

    @Override
    public void playMp4(String fileName) {
        log.info("Playing MP4 file {}", fileName);
    }
}
