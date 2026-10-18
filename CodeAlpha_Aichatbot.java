import java.util.Scanner;

//Knowledge Base part

public static knowledgeBase{

private HashMap<String , String> responses;

public knowledgeBase{

    responses = new HashMap<>();

    responses.put("hello",
                   "Hello! How can i help you?");
    responses.put("hi",
                "Hi! Nice to meet you.");
    responses.put("java",
                "Java is a high-level, object-oriented programming language.");
    responses.put("what is cse",
                "CSE stands for Computer Science and Engineering.");               
    responses.put("bye",
                "Goodbye! Have a great day.");

    responses.put("thank",
                "You're welcome!");                                            
}
public HashMap<String , String> getresponses:
{
    return responses;
}

}
public class Chatbot{

    private KnowledgeBase knowledgeBase;
    public Chatbot()
    {
        knowledgeBase = new KnowledgeBase();
    }

    public String getmessage(String name)
    {
         message = message.tolowerCase().trim();

         for(String keyword : knowledgeBase.getresponses().keySet() )
         {
            
            if(message.contains(keyword))
            {
            return knowledgeBase.getresponses().get(keyword);
            }

         }
          return "Sorry, I don't understand that yet.";
    }


}
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Chatbot chatbot = new Chatbot();

        System.out.println("=== JavaBot ===");
        System.out.println("Type 'bye' to exit.");

        while (true) {

            System.out.print("You: ");
            String message = scanner.nextLine();

            String response = chatbot.getResponse(message);

            System.out.println("Bot: " + response);

            if (message.toLowerCase().contains("bye")) {
                break;
            }
        }

        scanner.close();
    }
}
public String cleanText(String message) {

    message = message.toLowerCase();

    message = message.replaceAll("[^a-zA-Z ]", "");

    message = message.trim();

    return message;
}