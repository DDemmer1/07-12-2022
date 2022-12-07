package de.demmer.dennis;

public class Outbox {

	private EMail[] mails;
	public static int mailsSent = 0;
	
	

	public Outbox(int size) {
		mails = new EMail[size];
	}

	
	public void addMail(EMail mail) {

		for (int i = 0; i < mails.length; i++) {

			if (mails[i] == null) {
				mails[i] = mail;
				mailsSent++;
				return;
			}
		}
	}
	
	
	public void printAllMails() {
		
		for(int i = 0 ; i < mails.length ; i++) {
			
			if(mails[i] == null) {
				System.out.println(i + ".\t-");
			} else {
				System.out.println(i + ".\t" + mails[i].subject + "\t" +  mails[i].recipient);
			}
		}
	}
	
	
	public boolean deleteMail(int index) {
		
		
		if(mails[index] == null) {
			return false;
		} else {
			mails[index] = null;
			return true;
		}

	}
	
	
	
	
	
	

}
