package com.xcale.test.whatsapp.services;

import com.xcale.test.whatsapp.business.domain.Message;
import com.xcale.test.whatsapp.repository.MessageRepository;
import com.xcale.test.whatsapp.repository.entity.MessageEntity;
import org.springframework.stereotype.Service;

@Service(value = "databaseMessage")
public class MessageServicesImpl implements MessageServices {

    private final MessageRepository messageRepository;

    private final MessageServices messageServices;

    private final MessageEntity messageEntity;

    public MessageServicesImpl(MessageEntity messageEntity, MessageServices messageServices, MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
        this.messageServices = messageServices;
        this.messageEntity = messageEntity;
    }

    @Override
    public void sendMessage(Message message) {

    }
}
