package com.home.remindme.server.controller;


import com.home.remindme.server.entity.Remind;
import com.home.remindme.server.repository.RemindRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/remind")
public class ReminderController {

    final
    RemindRepository remindRepository;

    @Autowired
    public ReminderController(RemindRepository remindRepository) {
        this.remindRepository = remindRepository;
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public Remind getReminder() {
        List<Remind> remindList = remindRepository.findAll();
        return createMockRemind();
    }

    private Remind createMockRemind() {
        Remind r = new Remind();
        r.setId(1);
        r.setRemindDate(new Date());
        r.setTitle("my First remind");

        return r;
    }
}
