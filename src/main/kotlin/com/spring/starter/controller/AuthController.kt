package com.spring.starter.controller

import com.spring.starter.ResponseDto
import com.spring.starter.SignUpDto
import com.spring.starter.service.AuthService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/auth")
class AuthController(
    private val authService: AuthService
) {

    @PostMapping("/sign-up")
    fun signUp(@RequestBody request: SignUpDto): ResponseEntity<ResponseDto> {
        return ResponseEntity.ok(ResponseDto(authService.signUp(request)))
    }
}
