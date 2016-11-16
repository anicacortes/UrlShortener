package urlshortener.aeternum.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import urlshortener.common.repository.UserRepository;

import javax.servlet.http.HttpServletRequest;

@RestController
public class SignUp {
    private static final Logger LOG = LoggerFactory
        .getLogger(SignUp.class);

    @Autowired
    protected UserRepository userRepository;

    @RequestMapping(value = "/signUp", method = RequestMethod.POST)
    public ResponseEntity<String> signUp(@RequestParam("user") String username,
                                           @RequestParam("email") String email,
                                           @RequestParam("pass") String pass,
                                           @RequestParam("repass") String repass,
                                           HttpServletRequest request) {
        // TODO
        if (true) {
            LOG.info("System statistics");
            return new ResponseEntity<String>("\"Usuario creado correctamente\"", HttpStatus
                .CREATED);
        } else {
            LOG.info("Error to get the system statistics");
            return new ResponseEntity<String>("\"Usuario no creado\"",HttpStatus.BAD_REQUEST);
        }
    }
}
