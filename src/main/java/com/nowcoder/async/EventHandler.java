package com.nowcoder.async;

import java.util.List;

/**
 * @author 784909593
 * @data 2019/8/2 - 12:03
 */
public interface EventHandler {
    void doHandler(EventModel model);

    List<EventType> getSupportEventTypes();
}
