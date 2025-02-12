package priv.pront.mianshikun.esdao;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import priv.pront.mianshikun.model.dto.question.QuestionEsDTO;

import java.util.List;

/**
 * @Author: Pronting
 * @Description: TODO
 * @DateTime: 2025/2/12 9:57
 **/
public interface QuestionEsDao extends ElasticsearchRepository<QuestionEsDTO, Long> {

    /**
     * 根据用户id查询
     * @param userId
     * @return
     */
    List<QuestionEsDTO> findByUserId(Long userId);
}
