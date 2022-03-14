package com.xcale.test.whatsapp.business.domain;

import com.sun.istack.internal.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Message {

    @NotNull
    private String id;

    @NotNull
    private String to;

    @NotNull
    private MessageType recipient_type;

    private String text;
}
