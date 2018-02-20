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
    public String toString() {
        String transaction = "";
        transaction += "\n hash = "+getHash()+"\n";
        transaction += "\n prev_hash = "+getPrev_hash()+"\n";
        transaction += "\n pKey_sender = "+getPkey_sender()+"\n";
        transaction += "\n pKey_recipient = "+getPkey_recipient()+"\n";
        transaction += "\n mensaje = "+getMessage()+"\n";
        return transaction;
    }

    public void setpKey_sender(PublicKey pKey_sender) {
        this.pKey_sender = pKey_sender;
    }
    public PublicKey getpKey_sender() {
        return pKey_sender;
    }
    public void setpKey_recipient(PublicKey pKey_recipient) {
        this.pKey_recipient = pKey_recipient;
    }

    public PublicKey getpKey_recipient() {
        return pKey_recipient;
    }
    public void setPigcoins(double pigcoins) {
        this.pigcoins = pigcoins;
    }

    public double getPigcoins() {
        return pigcoins;
    }
    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getHash() {
        return hash;
    }
}
