/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quickchart;

import java.util.UUID;
/**
 *
 * @author Kylen
 */
public class Message {
    
   private final String messageId;
   private final int messageNumber;
   private final String recipient;
   private final String messageText;
   private final String messageHash;

    /**
     * @param args the command line arguments
     */
    public Message(int messageNumber, String recipient, String messageText) {
        this.messageID = Long.toString(ThreadLocalRandom.current()
                .nextLong(1_000_000_000L, 10_000_000_000L));
        this.messageNumber = messageNumber;
        this.recipient = recipient == null ? "" : recipient.trim();
        this.messageText = messageText == null ? "" : messageText.trim();
        this.messageHash = createMessageHash();
    }
    
    public boolean checkMessageID() { return messageID.length() <= 10; }
    
    public String checkRecipientCell() {
        if (recipient.matches("^\\+[1-9][0-9]{7,12}$")) {
            return "Cell phone number successfully captured.";
        }
        return "Cell phone number incorrectly formatted or does not contain an international code.";
    }

    
    
}
