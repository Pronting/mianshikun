package priv.pront.mianshikun.service;

import priv.pront.mianshikun.model.entity.PostThumb;
import com.baomidou.mybatisplus.extension.service.IService;
import priv.pront.mianshikun.model.entity.User;

/**
 * 帖子点赞服务
 *
 * @author <a href="https://github.com/Pronting">唐豪</a>
 * @from <a href="https://www.cnblogs.com/pronting">博客地址</a>
 */
public interface PostThumbService extends IService<PostThumb> {

    /**
     * 点赞
     *
     * @param postId
     * @param loginUser
     * @return
     */
    int doPostThumb(long postId, User loginUser);

    /**
     * 帖子点赞（内部服务）
     *
     * @param userId
     * @param postId
     * @return
     */
    int doPostThumbInner(long userId, long postId);
}
