//AUTHOR: Evan Albers
//DATE CREATED: 19 April 2022
//PURPOSE: basic class representing a block on the block chain


public abstract class block {
    
    block successor;
    block predecessor; 
    String date; 
    String type; 

    //constructor 
    block(block s, block p, String d, String t)
    {

        successor = s;
        predecessor = p;
        date = d;
        type = t;

    }

}
