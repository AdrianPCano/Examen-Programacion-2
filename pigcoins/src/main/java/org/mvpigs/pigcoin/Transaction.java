package org.mvpigs.pigcoins;

public class Transaction {
    private String hash = null; 
    private String prev_hash = null; 
    private PublicKey pKey_sender = null;
    private PublicKey pKey_recipient = null;
    private double pigcoins = 0; 
    private String message = null; 
    private byte[] signature = null;

}
