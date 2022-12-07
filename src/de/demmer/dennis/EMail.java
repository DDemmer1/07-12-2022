package de.demmer.dennis;

public class EMail {

	String text;
	String sender;
	String recipient;
	

	public EMail(String sender, String recipient) {
		this.sender = sender;
		this.recipient = recipient;
		this.text = "";
	}
	

}
