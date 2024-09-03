package com.littleworld.learning.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import java.net.http.HttpRequest
import java.net.http.HttpResponse

@RestController
@RequestMapping("/api/v1")
class TestController {

    @RequestMapping(value=["/vehicle"], method = [RequestMethod.GET])
    fun getVehicle():ResponseEntity<String>{
        println("getting vehicle details")
        return ResponseEntity<String>("vehicle1",HttpStatus.OK)
    }

}