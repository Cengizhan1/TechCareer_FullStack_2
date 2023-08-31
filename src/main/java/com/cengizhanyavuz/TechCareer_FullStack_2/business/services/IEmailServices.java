package com.cengizhanyavuz.TechCareer_FullStack_2.business.services;

import com.cengizhanyavuz.TechCareer_FullStack_2.business.dto.EmailDto;
import java.util.List;

public interface IEmailServices<D, E> extends  IEmailAttachment{

    public D entityToDto(E e);

    public E dtoToEntity(D d);

    public List<D> emailServiceList();

    @Override
    EmailDto basicSendEmail(EmailDto emailDto);

    @Override
    EmailDto intermediaSendEmail(EmailDto emailDto);
}