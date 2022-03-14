package com.xcale.test.whatsapp.controller;

import com.xcale.test.whatsapp.business.domain.Message;
import com.xcale.test.whatsapp.services.MessageServices;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseStatus;

public class SendTextMessage {

    private final MessageRestParser messageRestParser;
    private MessageServices messageServices;

    public SendTextMessage(MessageRestParser messageRestParser,
                           MessageServices messageServices) {
        this.messageRestParser = messageRestParser;
        this.messageServices = messageServices;
    }

    @PostMapping(value = "/v1/messages")
    @ResponseStatus(HttpStatus.CREATED)
    public void sendMessage(
            @RequestBody final Message request,
            @RequestHeader("Authorization") final String Auth) {
        Message message = this.messageRestParser.convertRequestToDomain(request);
        this.messageServices.sendMessage(message);
    }
}
