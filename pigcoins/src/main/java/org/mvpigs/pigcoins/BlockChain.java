package org.mvpigs.pigcoins;

import org.mvpigs.pigcoins.Transaction;

import java.util.ArrayList;
import java.security.PublicKey;
import java.util.Map;


public class BlockChain {

    ArrayList<Transaction> blockchain = new ArrayList<Transaction>();

    //Constructor
    public BlockChain(){
    }

    public ArrayList<Transaction> getBlockChain() {
        return this.blockChain;
    }

    public void addOrigin(Transaction transaction) {
        blockChain.add(transaction);
    }

    public boolean isConsumedCoinValid(Map<String,Double> usedCoins) {
        for (Map.Entry<String, Double> usedCoin : usedCoins.entrySet()) {
            if (getBlockChain().contains(usedCoin.getKey())) {
                return false;
            }
        }
        return true;
    }

    public boolean isSignatureValid(PublicKey sender, String message, byte[] messageSigned) {
        return GenSig.verify(sender, message, messageSigned);
    }
    public void summarize(){
        for (Transaction trx: blockchain) {
            System.out.println(trx.toString());
        }
    }
    public void summarize(int posicion){
        System.out.println(blockchain.get(posicion));
    }
}