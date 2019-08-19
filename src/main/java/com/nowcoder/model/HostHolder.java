package com.nowcoder.model;

import org.springframework.stereotype.Component;

/**
 * @author 784909593
 * @data 2019/7/31 - 11:41
 */
@Component
public class HostHolder {
    private static ThreadLocal<User> users = new ThreadLocal();

    public User getUser(){
        return users.get();
    }

    public void setUser(User user){
        users.set(user);
    }

    public void clear(){
        users.remove();
    }
}
