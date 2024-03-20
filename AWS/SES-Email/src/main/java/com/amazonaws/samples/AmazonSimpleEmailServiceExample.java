package com.amazonaws.samples;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class AmazonSimpleEmailServiceExample {

	  public static void main(String[] args) throws IOException {
		final String body = "This is an example body!";
		final String subject = "This is an example subject!";

		// Create a Properties object to contain connection configuration information.
		Properties props = System.getProperties();
		props.put("mail.transport.protocol", "smtps");
		props.put("mail.smtp.port", 25);    // this port number varies depending on your connection method

		// Set properties indicating that we want to use STARTTLS to encrypt the connection.
		// The SMTP session will begin on an unencrypted connection, and then the client
		// will issue a STARTTLS command to upgrade to an encrypted connection.
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.starttls.required", "true");

		// Create a Session object to represent a mail session with the specified properties.
		Session session = Session.getDefaultInstance(props);

		// Create a message with the specified information.
		MimeMessage msg = new MimeMessage(session);
		try {
      msg.setFrom(new InternetAddress("srinivasakatta@gmail.com"));
      msg.setRecipient(Message.RecipientType.TO, new InternetAddress("skatta3@yahoo.com"));
			msg.setSubject(subject);
			msg.setContent(body, "text/plain");
		} catch (MessagingException e) {
			System.out.println("ERROR: " + e.toString());
		}

		// Create a transport.
		Transport transport = null;
		try {
			transport = session.getTransport();
		} catch (NoSuchProviderException e) {
			System.out.println("ERROR: " + e.toString());
		}

		// Send the message.
		try {
			// Connect to Amazon SES using the SMTP USERNAME and PASSWORD you specified above
      // https://docs.aws.amazon.com/ses/latest/DeveloperGuide/smtp-credentials.html
			transport.connect("email-smtp.us-east-1.amazonaws.com", "AKIAQA55PZDY5RXV5L4G", "BP0QfZUHLITaafehWZ4DmLxnmyJGQT1rr1Da/yIeht1S");

			// Send the email.
			transport.sendMessage(msg, msg.getAllRecipients());
		} catch (Exception e) {
			System.out.println("ERROR: " + e.toString());
		} finally {
			// Close and terminate the connection.
			try {
				transport.close();
			} catch (MessagingException e) {
				System.out.println("ERROR: " + e.toString());
			}
		}
	}
}