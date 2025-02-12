package priv.pront.mianshikun.mapper;

import org.apache.ibatis.annotations.Select;
import priv.pront.mianshikun.model.entity.Question;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.Date;
import java.util.List;

/**
* @author asus
* @description 针对表【question(题目)】的数据库操作Mapper
* @createDate 2025-02-01 11:09:11
* @Entity priv.pront.mianshikun.model.entity.Question
*/
public interface QuestionMapper extends BaseMapper<Question> {

    @Select("select * from question where update_time > #{minUpdateTime}")
    List<Question> listQuestionWithDelete(Date minUpdateTime);

}




