/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quickchart;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author Kylen
 */
public class Message {
    
    private final String messageID;
    private final int messageNumber;
    private final String recipient;
    private final String messageText;
    private final String messageHash;
    private String status = "Pending";
    private static int totalMessagesSent = 0;
    private static final List<Message> sentMessages = new ArrayList<>();

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
    
    
}
