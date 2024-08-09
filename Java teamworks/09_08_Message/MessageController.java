package com.datorium.Datorium.API.Controllers;

import com.datorium.Datorium.API.DTOs.Message;
import com.datorium.Datorium.API.Services.MessageService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/message")
public class MessageController {
    private MessageService messageService;
    public MessageController(){
        messageService = new MessageService();
    }

    @PostMapping("/add") //localhost:8080/message/add
    public String add(@RequestBody Message message){
        return messageService.add(message);
    }
}
