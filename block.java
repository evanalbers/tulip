//AUTHOR: Evan Albers
//DATE CREATED: 19 April 2022
//PURPOSE: basic class representing a block on the block chain


public abstract class block {
    
    private block successor;
    private block predecessor; 
    private String date; 
    private String type; 

    //constructor 
    block(Object[] attributes)
    {

        this.successor = (block) attributes[0];
        this.predecessor = (block) attributes[1];
        this.date = (String) attributes [2];
        this.type = (String) attributes [3];

    }

    public block getPredecessor() {
        return predecessor;
    }

    public block getSuccessor() {
        return successor;
    }

    public String getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

    public void setPredecessor(block predecessor) {
        this.predecessor = predecessor;
    }

    public void setSuccessor(block successor) {
        this.successor = successor;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setType(String type) {
        this.type = type;
    }

    

}
