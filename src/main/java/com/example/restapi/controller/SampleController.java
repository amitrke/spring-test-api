package com.example.restapi.controller;

import com.example.restapi.model.APIResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/status")
    public APIResponse status() {
        return new APIResponse();
    }
}
