import java.util.*;

import java.lang.*;


public class ChannelName{

    private String channelName;
    private ArrayList<String> frameHeight;
    private HashMap<String, ArrayList<Value>> userVideoFilesMap;

    public ChannelName(){
        this.channelName = new String();
        this.frameHeight = new ArrayList<String>();
        this.userVideoFilesMap = new  HashMap<String, ArrayList<Value>>();
    }

    public ChannelName(String channel, ArrayList<String> height, HashMap<String, ArrayList<Value>> map){
        this.channelName = channel;
        this.frameHeight = height;
        this.userVideoFilesMap = map;
    }
}