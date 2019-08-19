package com.nowcoder.service;

import com.nowcoder.dao.FeedDAO;
import com.nowcoder.model.Feed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 784909593
 * @data 2019/8/3 - 21:03
 */
@Service
public class FeedService {
    @Autowired
    FeedDAO feedDAO;

    public List<Feed> getUserFeeds(int maxId, List<Integer> userIds, int count){
        return feedDAO.selectUserFeeds(maxId,userIds,count);
    }

    public boolean addFeed(Feed feed){
        feedDAO.addFeed(feed);
        return feed.getId() > 0;
    }

    public Feed getById(int id){
        return feedDAO.getFeedById(id);
    }

}
