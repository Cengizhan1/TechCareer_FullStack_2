package com.cengizhanyavuz.TechCareer_FullStack_2.auditing;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

// LOMBOK
@Getter @Setter
abstract  public class AuditingAwareBaseDto  implements Serializable {

    public static final Long serialVersionUID=1L;
    private Long id;
    @Builder.Default
    private Date systemDate=new Date(System.currentTimeMillis());
}