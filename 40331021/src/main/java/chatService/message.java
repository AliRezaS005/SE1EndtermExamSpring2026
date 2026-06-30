package chatService;

public abstract class Message {

    protected int messageId;

    protected String cipherText;

    public abstract void send();

}