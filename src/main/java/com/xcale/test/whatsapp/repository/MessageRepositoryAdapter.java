package com.xcale.test.whatsapp.repository;

import com.xcale.test.whatsapp.business.domain.Message;
import com.xcale.test.whatsapp.repository.entity.MessageEntity;
import org.springframework.beans.factory.annotation.Autowired;

public class MessageRepositoryAdapter {

    private final MessageRepository messageRepository;
    private final MessageEntity messageEntity;

    public MessageRepositoryAdapter(MessageEntity messageEntity, MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
        this.messageEntity = messageEntity;
    }

    @Autowired
    public MessageEntity sendMessage (Message message) {
        return null;
    }

}
