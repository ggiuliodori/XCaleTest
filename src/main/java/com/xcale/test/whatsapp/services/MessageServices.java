package com.xcale.test.whatsapp.services;

import com.xcale.test.whatsapp.business.domain.Message;
import com.xcale.test.whatsapp.repository.entity.MessageEntity;

public interface MessageServices {

    void sendMessage(Message message);
}
