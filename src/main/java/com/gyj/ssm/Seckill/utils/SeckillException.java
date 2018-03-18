package com.gyj.ssm.Seckill.utils;

/**
 * 秒杀相关的所有业务异常
 * Created by Gao on 2018/3/18.
 */
public class SeckillException extends RuntimeException {
    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
