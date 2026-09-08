package willydekeyser.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Timecontroller {

	@GetMapping("/time")
	public String time() {
		LocalDateTime currentTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-dd hh:mm:ss");
		String formattedTime = currentTime.format(formatter);
		return "<h3>Time: " + formattedTime + "</h3>";
	}
}
