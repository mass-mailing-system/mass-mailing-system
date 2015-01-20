package com.mass.mailing.system.whatsApp;

import com.mass.mailing.system.message.MessageService;
import com.mass.mailing.system.messager.Messager;

import java.io.IOException;


//USER_PHONE & PASSWORD я захардкодил;
//думаю, нужно будет поменять, если пользователь будет меняться


/**
 * Prepares terminal commands and executes scripts for sending whatsApp messages
 *
 * @author Illia Rudenko
 * @author Oleg Kozak
 */

public class WhatsAppSender extends Messager {

    public static final String RUN_COMMAND = "python run.py";
    public static final String WHATSAPP_SCRIPT_PATH =
            "/home/darm/IdeaProjects/system-mass-mailing/whatsApp"; //insert your own path to script files
    public static final String USER_PHONE = "<user phone>"; //type here registered phone number to send messages from

    //to get password use "python yowsup-cli demos --help-config"
    public static final String PASSWORD = "<user password>"; //type here password in base64

    public WhatsAppSender(MessageService m) {
        super(m);
    }

    @Override
    public void execute() {

        //writes all contact phones to a temporary text file
        ContactSerializer.serialize(getMessageService().getContacts());

        try {
            //for python script successful, run terminal command must look like that:
            //python run.py <textFileName> <text message> <userPhone> <password base64>
            String command = createCommand();
            System.out.println(command);
            String response = OsUtils.runCommand(command, WHATSAPP_SCRIPT_PATH);

            System.out.println(response);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            System.out.println("Interrupted!");
            e.printStackTrace();
        }

        //deletes temporary text file
        ContactSerializer.deleteFile();
    }

    /**
     * Creates command which runs python script
     *
     * @return String command to execute in terminal
     */
    private String createCommand() {
        StringBuilder sb = new StringBuilder();
        sb.append(RUN_COMMAND);
        sb.append(" ");
        sb.append(ContactSerializer.FILE_NAME);
        sb.append(" ");
        sb.append(getMessageService().getMessageTemplate().getTextContent().getContent()); //too long getters chain =)
        sb.append(" ");
        sb.append(USER_PHONE);
        sb.append(" ");
        sb.append(PASSWORD);

        return sb.toString();
    }

}
