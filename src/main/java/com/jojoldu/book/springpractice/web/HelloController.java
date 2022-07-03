package com.jojoldu.book.springpractice.web;

import com.jojoldu.book.springpractice.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // Json 반환 컨트롤러
public class HelloController {
    @GetMapping("/hello") // Get 요청 받는 API
    public String hello(){
        return "hello";
    }
    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String
                                     name,
                                     @RequestParam("amount") int
                                     amount ){
        return new HelloResponseDto(name, amount);
    }

}
