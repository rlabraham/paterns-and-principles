package com.rabraham.patterns.structural.adapter.impl;

import com.rabraham.patterns.structural.adapter.AdvancedMediaPlayer;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        log.info("Playing VLC file {}", fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //do nothing.
    }
}
