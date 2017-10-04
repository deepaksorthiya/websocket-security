package hello;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

	@MessageMapping("/hello")
	@SendTo("/topic/greetings")
	public HelloMessage greeting(HelloMessage message) throws InterruptedException {
		Thread.sleep(1000); // simulated delay
		return message;
	}

}
