interface Broker_interface{
    public void calculateKeys();
    public Publisher acceptConnection(Publisher p);
    //public Consumer acceptConnection(Consumer c);
    public void notifyPublisher(String str);
    public void notifyBrokersOnChanges();
    public void pull(String str);
    public void filterConsumers(String str);
}