package com.client.email.service.impl;

import com.client.email.service.EmailService;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

    @Override
    public String getEmailById(Integer id) {
        if(id != null){
            StringBuilder sb = new StringBuilder();
            sb.append(id);
            sb.append("@rest.local");
            return sb.toString();
        }else{
            return null;
        }
    }

}
