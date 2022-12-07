package de.demmer.dennis;

public class Application {
	
	public static void main(String[] args) {
		
	
		EMail mail1 = new EMail("Dennis.Demmer@uni-koeln.de", "Nils.Reiter@uni-koeln.de", "Hallo Welt");
		EMail mail2 = new EMail("Jürgen.Hermes@uni-koeln.de", "Dennis.Demmer@uni-koeln.de", "Meine erste Mail");
		
		Outbox postausgang = new Outbox(10);
		
		postausgang.addMail(mail1);
		postausgang.addMail(mail2);
		
		
		postausgang.printAllMails();
		
		MailUtil.printInfo();
		
		postausgang.deleteMail(0);
		postausgang.printAllMails();
		
	
	}

}
