package com.cengizhanyavuz.TechCareer_FullStack_2.business.services;


import com.cengizhanyavuz.TechCareer_FullStack_2.business.dto.EmailDto;

public interface IEmailAttachment  {

    public EmailDto basicSendEmail(EmailDto emailDto);
    public EmailDto intermediaSendEmail(EmailDto emailDto);
}