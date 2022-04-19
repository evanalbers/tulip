//AUTHOR: Evan Albers
//DATE CREATED: April 19 2022
//PURPOSE: Abstract class representing a user on the network

public class node
{
    //basic idea of a node: has a private key, public key, balance of tulips
    private String privateKey;
    public String publicKey;

    private long balance = 0;


    //constructor 
    public node(String priKey, String pubKey)
    {

            privateKey = priKey; //setting keys
            publicKey = pubKey;

    }

    //used to modify the balance of a node's tulips 
    public modifyBalance(long change)
    {

        balance += change;

    }






}