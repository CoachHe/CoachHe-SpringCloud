package com.coachhe.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author heyizhi
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    /**
     * 这里用long是因为对应数据库值为bigint
     */
    private Long id;

    private String serial;
}
