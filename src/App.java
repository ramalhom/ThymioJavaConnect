import services.ThymioSender;
/**
 * Launch application for Thymio Java Connect
 */
public class App {

    public static void main(String[] args) throws Exception {

       ThymioSender thymioSender = new ThymioSender();
       thymioSender.run();

   
    }
}
