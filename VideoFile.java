import java.util.*;

import java.lang.*;


public class VideoFile{

    //Variables
    private String videoName;
    private String channelName;
    private String dateCreated;
    private String length;
    private String framerate;
    private String frameWidth;
    private ArrayList<String> frameHeight;
    private byte videoFileChunk;


    public VideoFile(String videoname, String channel, String date, String len, String frate, String width, ArrayList<String> height, byte chunk){
         this.videoName = videoname;
         this.channelName = channel;
         this.dateCreated = date;
         this.length = len;
         this.framerate = frate;
         this.frameWidth = width;
         this.frameHeight = height;
         this.videoFileChunk = chunk;
    }

    public VideoFile(){
        this.videoName = "";
         this.channelName = "";
         this.dateCreated = "";
         this.length = "";
         this.framerate = "";
         this.frameWidth = "";
         this.frameHeight = new ArrayList<String>();
         this.videoFileChunk = 0;
    }
}