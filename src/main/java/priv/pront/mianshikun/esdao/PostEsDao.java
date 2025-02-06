package priv.pront.mianshikun.esdao;

import priv.pront.mianshikun.model.dto.post.PostEsDTO;
import java.util.List;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * 帖子 ES 操作
 *
 * @author <a href="https://github.com/Pronting">唐豪</a>
 * @from <a href="https://www.cnblogs.com/pronting">博客地址</a>
 */
public interface PostEsDao extends ElasticsearchRepository<PostEsDTO, Long> {

    List<PostEsDTO> findByUserId(Long userId);
}