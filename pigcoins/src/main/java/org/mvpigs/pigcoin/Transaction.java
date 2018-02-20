package org.mvpigs.pigcoins;

public class Transaction {
    private String hash = null; 
    private String prev_hash = null; 
    private PublicKey pKey_sender = null;
    private PublicKey pKey_recipient = null;
    private double pigcoins = 0; 
    private String message = null; 
    private byte[] signature = null;
    

    //Constructor
    public Transaction() {
    }

    public Transaction(String hash, String prev_hash, PublicKey pKey_sender, PublicKey pKey_recipient, double pigcoins, String message) {
        this.hash = hash;
        this.prev_hash = prev_hash;
        this.pKey_sender = pKey_sender;
        this.pKey_recipient = pKey_recipient;
        this.pigcoins = pigcoins;
        this.message = message;
    }
    
}
