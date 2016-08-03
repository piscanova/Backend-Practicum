package io.github.todolist.core.service.impl;

import io.github.todolist.core.domain.LiveFeedBean;
import io.github.todolist.core.repository.api.LiveFeedRepository;
import io.github.todolist.core.service.api.LiveFeedService;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Paranjay on 8/2/2016.
 */
@Service
@Transactional
public class LiveFeedServiceImpl implements LiveFeedService {
    private JSONArray jsonArray;
    @Autowired
    private LiveFeedRepository liveFeedRepository;
    public JSONArray getAllLiveFeed() {
        for(int i = 1; i <= 500; i++) {
            LiveFeedBean bean = liveFeedRepository.getLiveFeedBean(i);
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("ip", bean.getIp());
            jsonObject.put("country", bean.getCountry());
            jsonObject.put("state", bean.getState());
            jsonObject.put("fileName", bean.getFileName());
            jsonObject.put("infection", bean.getInfection());
            jsonObject.put("port", bean.getPort());
            jsonArray.put(jsonObject);
        }
        return jsonArray;
    }

}
