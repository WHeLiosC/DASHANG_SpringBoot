package com.dashang.mapper;

import com.dashang.model.*;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DsDraftDao {
    int deleteByPrimaryKey(Integer draftId);

    int insert(DsDraft record);

    int insertSelective(DsDraft record);

    DsDraft selectByPrimaryKey(Integer draftId);

    int updateByPrimaryKeySelective(DsDraft record);

    int updateByPrimaryKey(DsDraft record);

    int selectDraftNum(String name);

    Page<DsDraft> selectDraft(Integer userId);
}