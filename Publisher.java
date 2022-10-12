import java.util.*;

public class Publisher implements Publisher_interface,Node{

    private ChannelName channelName;

    //--------------------------------------------------------------

    public void addHashTag(String str){

    }
    public void removeHashTag(String str){

    }
    public void getBrokerList(){

    }
    public Broker HashTopic(String str){
        return null;
    }
    public void push(String str,Value v){
        
    }
    public void notifyFailure(Broker b){
        
    }
    public void notifyBrokersForHashTags(String str){
        
    }
    public void generateChunks(String str){
        
    }

    //Node methods

    public void init(int i){

    }
    public void connect(){

    }
    public void disconnect(){

    }
    public void updateNodes(){

    }
    public List<Broker> getBrokers(){
        return null;
    }
}