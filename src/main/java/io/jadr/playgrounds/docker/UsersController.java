package io.jadr.playgrounds.docker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/users")
public class UsersController {
	@RequestMapping(method = RequestMethod.GET)
	String index() {
        return "users#index";
    }
}
