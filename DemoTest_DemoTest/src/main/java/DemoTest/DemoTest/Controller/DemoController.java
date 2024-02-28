package DemoTest.DemoTest.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import DemoTest.DemoTest.Model.Demo;
import DemoTest.DemoTest.Repository.DemoRepo;
@RestController
@RequestMapping("/api/users")
public class DemoController {
	@Autowired
    private DemoRepo demoRepo;

    @PostMapping("/add")
    public ResponseEntity<String> addUser(@RequestBody Demo demo) {
        // Generate password using JavaScript logic
        String password = generatePassword(demo.getFirstName(), demo.getMiddleName(), demo.getLastName());

        // Set the password and save the user to the database
        demo.setPassword(password);
        demoRepo.save(demo);

        return ResponseEntity.ok("User added successfully!");
    }

	private String generatePassword(String firstName, String middleName, String lastName) {
		// TODO Auto-generated method stub
		return null;
	}
}
