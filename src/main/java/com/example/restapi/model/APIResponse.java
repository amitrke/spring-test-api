package com.example.restapi.model;

import java.util.Date;
import java.util.UUID;

public class APIResponse {
    private String id;
    private String status;
    private Date generatedOn;

    public APIResponse() {
        UUID uuid = UUID.randomUUID();
        this.id = uuid.toString();
        this.status = "In-Progress";
        this.generatedOn = new Date();
    }

    public String getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public Date getGeneratedOn() {
        return generatedOn;
    }

    @Override
    public String toString() {
        return "APIResponse{" +
                "id='" + id + '\'' +
                ", status='" + status + '\'' +
                ", generatedOn=" + generatedOn +
                '}';
    }
}
