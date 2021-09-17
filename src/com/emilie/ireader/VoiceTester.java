package com.emilie.ireader;

import com.imooc.ireader.utils.TTS;

public class VoiceTester {
    public static void main(String[] args) {
        TTS tts = new TTS();
        tts.appid = "52f9ca6a";
        tts.apiKey = "f9cbc3d84edf8ed5bfca495193003050";
        tts.apiSecret = "MTk1MTM4ODc2NWE5NTlhYmE5NTcxZDc0";
        tts.voiceLocation = "d:/temp/voice";
        // 1 registration
        String authUrl = tts.getAuthUrl();
        // 2 translate to mp3 and download
        String filePath = tts.startDoTTS(authUrl, "First Java","xiaoyan", 50, 70);
        System.out.println(filePath);
        // 3 play
        tts.play(filePath);
    }
}
