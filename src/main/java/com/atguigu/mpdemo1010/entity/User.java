package com.atguigu.mpdemo1010.entity;


import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author:guxiang
 * @version:2020-07-05
 */
@Data
public class User implements Serializable {

    private Long id ;

    private Integer age;

    private String name;

    private String email;

    @TableField(value = "create_time",fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(value = "update_time",fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

}
