import java.util.Random;

public class Responder {
    private String[] responses = {
        "That sounds interesting. Tell me more...",
        "I'm sorry to hear that. Can you describe it further?",
        "Can you please clarify the issue?",
        "That seems unusual. Let me think about it...",
        "I see. How long has this been happening?",
        "Have you tried restarting the application?"
    };

    public String generateResponse(String input) {
        Random random = new Random();
        return responses[random.nextInt(responses.length)];
    }
}
