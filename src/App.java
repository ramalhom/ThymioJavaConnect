import services.ThymioSender;

/**
 * Launch application for Thymio Java Connect
 */
public class App {

    public static void main(String[] args) throws Exception {

        ThymioSender thymioSender = new ThymioSender("Thymio");
        thymioSender.start();

        thymioSender.sendProgram("call leds.top(32, 0, 0)motor.left.target =300\r\nmotor.right.target = 300");
        Thread.sleep(3000);
        thymioSender.sendProgram("call leds.top(0, 32, 0)motor.left.target =0\r\nmotor.right.target = 0");
        Thread.sleep(3000);
        thymioSender.setRunning(false);
        thymioSender.join();
        System.gc();
    }
}
