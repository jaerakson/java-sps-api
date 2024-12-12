package org.example.spsapi.data.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;


@Getter
@Setter
@ToString
@Table(schema = "t_user")
public class T_userEntity {
    @Id
    @Column(name="user_key")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  String user_Key;

    @Column(name = "nick_nm" , nullable = false , unique = true,columnDefinition = "varchar(50) NOT NULL COMMENT '닉네임'")
    private String nick_nm;

//    @CreationTimestamp
//    @Column(name = "create_dt" , nullable = true)
//    private Date create_dt;

}
