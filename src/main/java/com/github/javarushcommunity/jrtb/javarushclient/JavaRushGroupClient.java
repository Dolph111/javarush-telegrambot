package com.github.javarushcommunity.jrtb.javarushclient;

import com.github.javarushcommunity.jrtb.javarushclient.dto.GroupsCountRequestArgs;
import com.github.javarushcommunity.jrtb.javarushclient.dto.GroupDiscussionInfo;
import com.github.javarushcommunity.jrtb.javarushclient.dto.GroupInfo;
import com.github.javarushcommunity.jrtb.javarushclient.dto.GroupRequestArgs;

import java.util.List;

public interface JavaRushGroupClient {
    List<GroupInfo> getGroupList(GroupRequestArgs requestArgs);
    List<GroupDiscussionInfo> getGroupDiscussionList(GroupRequestArgs requestArgs);
    Integer getGroupCount(GroupsCountRequestArgs countRequestArgs);
    GroupDiscussionInfo getGroupById(Integer id);
}
