package com.responseentity.SBProj9;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("users")
    public ResponseEntity < List < User >> users() {
        List < User > users = new ArrayList < > ();
        users.add(new User(1, "Ramesh"));
        users.add(new User(2, "Tony"));
        users.add(new User(3, "Tom"));
        HttpHeaders headers = new HttpHeaders();
        headers.add("Responded", "UserController");
        return ResponseEntity.accepted().headers(headers).body(users);
    }

    @GetMapping("/users1")
    @ResponseBody
    public List < User > users1() {
        List < User > users = new ArrayList < > ();
        users.add(new User(1, "Ramesh"));
        users.add(new User(2, "Tony"));
        users.add(new User(3, "Tom"));
        return users;
    }
}
