// Step 1: Create an interface (abstraction)
interface MessageService {
    void sendMessage(String message);
}

// Step 2: Implement different notification services
class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending Email: " + message);
    }
}

class SMSService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

class WhatsAppService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending WhatsApp Message: " + message);
    }
}

// Step 3: Use Dependency Injection in Notification
class Notification {
    private MessageService messageService;  // ✅ Depends on abstraction

    Notification(MessageService messageService) {
        this.messageService = messageService;  // ✅ Inject dependency
    }

    void notifyUser(String message) {
        messageService.sendMessage(message);
    }
}

// Step 4: Test with different services
public class solid {
    public static void main(String[] args) {
        MessageService email = new EmailService();
        Notification emailNotification = new Notification(email);
        emailNotification.notifyUser("Hello via Email!");

        MessageService sms = new SMSService();
        Notification smsNotification = new Notification(sms);
        smsNotification.notifyUser("Hello via SMS!");

        MessageService whatsapp = new WhatsAppService();
        Notification whatsappNotification = new Notification(whatsapp);
        whatsappNotification.notifyUser("Hello via WhatsApp!");
    }
}
