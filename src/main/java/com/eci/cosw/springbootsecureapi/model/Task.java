package com.eci.cosw.springbootsecureapi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public @Data class Task implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Long id;

    private String description;

    private String status;

    private String responsible;

    private Date dueDate;

}
