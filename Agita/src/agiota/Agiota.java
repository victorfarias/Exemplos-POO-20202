package agiota;

import java.util.ArrayList;
import java.util.HashMap;

public class Agiota {

	private int nextTrId;
	private float balance;
	private HashMap<String, Client> repClient;
	private HashMap<Integer, Transaction> repTrans;
	
	public Agiota(float saldoInicial) {
		this.nextTrId = 0;
		this.balance = saldoInicial;
		this.repClient = new HashMap<String, Client>();
		this.repTrans = new HashMap<Integer, Transaction>();
	}
	
	public void addCli(String codename, float limite) {
		if(this.repClient.containsKey(codename) == true) {
			System.out.println("fail: cliente ja existe");
			return;
		}				
				
		Client client = new Client(codename, limite);
		repClient.put(codename, client);
	}
	
	public void lend(String codename, float value) {
		Client client = repClient.get(codename);
		if(client == null) {
			System.out.println("fail: cliente nao existe");
			return;
		}else if(this.balance <= value) {
			System.out.println("fail: fundos insuficientes");
			return;
		}else if((client.limite - client.balance) <= value) {
			System.out.println("fail: limite excedido");
			return;
		}
		
		client.balance += value;
		
		Transaction transaction = new Transaction(this.nextTrId, codename, value);		
		this.balance -= value;
		this.repTrans.put(this.nextTrId, transaction);
		
		this.nextTrId ++;
		
		
	}
	
	public void receive(String codename, float value){
		Client client = this.repClient.get(codename);
		if(client.balance < value) {
			System.out.println("fail: valor maior que a divida");
			return;
		}
		
		client.balance -= value;
		this.balance += value;
		
		Transaction transaction = new Transaction(nextTrId, codename, value*-1);
		this.repTrans.put(nextTrId, transaction);
		this.nextTrId ++;
	}
	
	public void kill(String codename) {
		this.repClient.remove(codename);
		ArrayList<Integer> indices = new ArrayList<Integer>();
		for(Integer k: this.repTrans.keySet()) {
			Transaction transaction = this.repTrans.get(k);
			if(transaction.codename.equals(codename)) {
				indices.add(k);
			}
		}
		for(Integer k: indices) {
			this.repTrans.remove(k);
		}
	}
	
	public String toString() {
		String resultado = "clients:\n";
		for(String k: this.repClient.keySet()) {
			resultado += ("- " + this.repClient.get(k) + "\n");
		}
		resultado += "transactions: \n";
		for(Integer k: this.repTrans.keySet()) {
			resultado += ("- " + this.repTrans.get(k) + "\n");
		}
		resultado += "balance: " + this.balance;
		return resultado;		
	}
	
	
}
