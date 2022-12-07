package de.demmer.dennis;

public class Outbox {

	private EMail[] mails;

	public Outbox(int size) {
		mails = new EMail[size];

	}

	public void addMail(EMail mail) {

		for (int i = 0; i < mails.length; i++) {

			if (mails[i] == null) {
				mails[i] = mail;
				return;
			}
		}
	}

}
