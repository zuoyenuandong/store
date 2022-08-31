package com.kuang.store.thirdparty.service;

import darabonba.core.exception.ClientException;

import java.util.concurrent.ExecutionException;


public interface SmsService{

    void send(String mobile, String checkCode) throws ClientException, ExecutionException, InterruptedException;
}
