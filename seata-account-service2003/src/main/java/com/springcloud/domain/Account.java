package com.springcloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @auther wy
 * @create 2021/11/9 19:06
 */

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Account {

    private Long id;
    private Long userId;
    private Float totall;
    private Float used;
    private Float residue;

}
