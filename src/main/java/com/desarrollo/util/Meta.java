package com.desarrollo.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data public class Meta {

    private String transactionID;

    private String status;

    private int statusCode;

    private String timestamp;

    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    private String message;


    public Meta(String status, int statusCode) {
        this.transactionID = UUID.randomUUID().toString();
        this.status = status;
        this.statusCode = statusCode;
        this.timestamp = LocalDateTime.now().toString();
    }

    public Meta(String status, int statusCode, String message) {
        this.transactionID = UUID.randomUUID().toString();
        this.status = status;
        this.statusCode = statusCode;
        this.timestamp = LocalDateTime.now().toString();;
        this.message = message;
    }
}
