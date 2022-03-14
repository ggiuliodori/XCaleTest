package com.xcale.test.whatsapp.repository;

import com.xcale.test.whatsapp.repository.entity.MessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<MessageEntity, String> {

}
