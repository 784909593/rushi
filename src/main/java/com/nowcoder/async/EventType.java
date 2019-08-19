package com.nowcoder.async;

/**
 * @author 784909593
 * @data 2019/8/2 - 12:17
 */
public enum EventType {
    LIKE(0),
    COMMENT(1),
    LOGIN(2),
    MAIL(3),
    FOLLOW(4),
    UNFOLLOW(5);;

    private int value;
    EventType(int value) {this.value = value;}
    public int getValue(){return value;}
}
