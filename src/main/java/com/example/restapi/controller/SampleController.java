package com.example.restapi.controller;

import com.example.restapi.model.APIResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
public class SampleController {

    private static final Logger logger = LogManager.getLogger(SampleController.class);

    @GetMapping("/status")
    public APIResponse status() {
        logger.info("This is a message");
        return new APIResponse();
    }
}
