package com.spring.starter.service

import com.spring.starter.SignUpDto
import com.spring.starter.entity.User
import com.spring.starter.repository.UserRepository
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class AuthService(
    private val userRepository: UserRepository
) {
    fun signUp(request: SignUpDto): Boolean {
        request.apply {
            val userCheck = userRepository.findByUserId(userId)
            if (userCheck == null) {
                userRepository.save(User(userId, password))
                return true
            } else {
                return false
            }
        }

    }
}