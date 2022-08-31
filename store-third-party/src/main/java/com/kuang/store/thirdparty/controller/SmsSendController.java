package com.kuang.store.thirdparty.controller;


import com.kuang.common.utils.R;
import com.kuang.store.thirdparty.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/sms")
public class SmsSendController {
    @Autowired
    SmsService smsService;

    @GetMapping(value = "/sendCode")
    public R sendCode(@RequestParam("phone") String phone, @RequestParam("code") String code) throws ExecutionException, InterruptedException {

        //发送验证码
        smsService.send(phone,code);

        return R.ok();
    }
}
