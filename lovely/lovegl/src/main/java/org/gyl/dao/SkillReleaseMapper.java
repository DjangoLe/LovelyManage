package org.gyl.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.gyl.model.SkillRelease;
import org.gyl.model.SkillReleaseExample;

public interface SkillReleaseMapper {
    int countByExample(SkillReleaseExample example);

    int deleteByExample(SkillReleaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SkillRelease record);

    int insertSelective(SkillRelease record);

    List<SkillRelease> selectByExample(SkillReleaseExample example);

    SkillRelease selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SkillRelease record, @Param("example") SkillReleaseExample example);

    int updateByExample(@Param("record") SkillRelease record, @Param("example") SkillReleaseExample example);

    int updateByPrimaryKeySelective(SkillRelease record);

    int updateByPrimaryKey(SkillRelease record);
}