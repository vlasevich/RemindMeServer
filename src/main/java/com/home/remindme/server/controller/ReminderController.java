package com.home.remindme.server.controller;

import com.home.remindme.server.entity.Remind;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/remind")
public class ReminderController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public Remind getReminder(ModelMap modelMap) {
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
