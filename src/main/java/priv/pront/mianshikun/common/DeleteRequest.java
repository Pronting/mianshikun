package priv.pront.mianshikun.common;

import java.io.Serializable;
import lombok.Data;

/**
 * 删除请求
 *
 * @author <a href="https://github.com/Pronting">唐豪</a>
 * @from <a href="https://www.cnblogs.com/pronting">博客地址</a>
 */
@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}