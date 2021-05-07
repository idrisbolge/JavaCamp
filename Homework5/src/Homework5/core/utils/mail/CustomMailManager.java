package Homework5.core.utils.mail;

public class CustomMailManager implements MailService {

	@Override
	public void sendMail(String to, String message) {
		System.out.println(to+" adresine "+message+" içerikli mail gönderildi.");
		
	}

}
