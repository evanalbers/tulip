public class TransactionBlock extends block
{
    private String sender;
    private String recipient;


    //constructor 
    TransactionBlock(block s, block p, String d, String t, String sen, String rec)
    {
        
        super(new Object[]{s, p, d, t});

        this.sender = sen;
        this.recipient = rec;

    }

    //getter method for sender
    public String getSender() {
        return sender;
    }

    //getter for recipient
    public String getRecipient() {
        return recipient;
    }


}
