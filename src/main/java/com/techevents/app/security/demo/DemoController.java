package com.techevents.app.security.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sneakers")
public class DemoController {

  @GetMapping("/admin")
  @PreAuthorize("hasAuthority('ADMIN')")
  public ResponseEntity<String> sayHelloAdmin() {
    return ResponseEntity.ok("Hello ADMIN from secured endpoint");
  }

  @GetMapping("/user")
  @PreAuthorize("hasAuthority('USER')")
  public ResponseEntity<String> sayHelloUser() {
    return ResponseEntity.ok("Hello USER from secured endpoint");
  }

  @GetMapping("/public")
  public ResponseEntity<String> sayHelloPublic() {
    return ResponseEntity.ok("Hello PUBLIC endpoint");
  }

}
