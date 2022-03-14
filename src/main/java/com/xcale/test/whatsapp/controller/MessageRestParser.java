package com.xcale.test.whatsapp.controller;

import com.xcale.test.whatsapp.business.domain.Message;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class MessageRestParser {

    public Message convertRequestToDomain(Message request) {
        return Optional.ofNullable(request).map(element -> Message.builder()
                .id(request.getId())
                .to(request.getTo())
                .recipient_type(request.getRecipient_type())
                .text(request.getText())
                .build()
        ).orElse(null);
    }
}
