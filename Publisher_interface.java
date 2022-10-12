interface Publisher_interface{
    public void addHashTag(String str);
    public void removeHashTag(String str);
    public void getBrokerList();
    public Broker HashTopic(String str);
    public void push(String str,Value v);
    public void notifyFailure(Broker b);
    public void notifyBrokersForHashTags(String str);
    public void generateChunks(String str);
}