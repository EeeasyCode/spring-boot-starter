package com.spring.starter.controller


import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1")
class HelloController {

    @GetMapping("/hello")
    fun hello():String {
        return "hello hi"
    }
}