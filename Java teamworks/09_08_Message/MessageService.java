package com.datorium.Datorium.API.Services;

import com.datorium.Datorium.API.DTOs.Message;

public class MessageService {
    public String add(Message message) {
        return "Good luck learning programming, " + message.name + " :)";
    }
}
