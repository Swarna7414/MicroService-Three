package com.ServiceThree.TheThree.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/three")
public class ThirdController {

    @GetMapping("/check")
    public String send(){
        return "Hello ra Puka";
    }

    @GetMapping("/checkparameter")
    public String sendWithParam(@RequestParam String param){
        return "this is the Parameter"+param;
    }

    @GetMapping("/withResponseEntity")
    public ResponseEntity<String> responseEntity(){
        return ResponseEntity.ok("Returned");
    }

    @GetMapping("/checkresponsewithparam")
    public ResponseEntity<String> responseEntityCheck(@RequestParam String param){
        return ResponseEntity.ok("done with the Entity"+param);
    }

}