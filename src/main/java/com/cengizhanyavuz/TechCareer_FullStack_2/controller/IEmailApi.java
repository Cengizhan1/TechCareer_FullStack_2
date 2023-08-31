package com.cengizhanyavuz.TechCareer_FullStack_2.controller;

import com.cengizhanyavuz.TechCareer_FullStack_2.business.dto.EmailDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IEmailApi<D> {

    public ResponseEntity<List<D>>  emailServiceList();
    ResponseEntity<?> basicApiSendEmail (EmailDto emailDto);
    ResponseEntity<EmailDto> intermediaApiSendEmail (EmailDto emailDto);
}