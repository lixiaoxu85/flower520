package com.lxx.base.resp;


/**
 * 音乐消息
 * 
 */
public class MusicMessage extends RecBaseMessage {
	// 音乐
	private Music Music;

	public Music getMusic() {
		return Music;
	}

	public void setMusic(Music music) {
		Music = music;
	}
}