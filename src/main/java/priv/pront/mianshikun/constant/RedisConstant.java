package priv.pront.mianshikun.constant;

/**
 * @Author: Pronting
 * @Description: TODO
 * @DateTime: 2025/2/10 11:09
 **/
public interface RedisConstant {

    /**
     * 签到记录 Redis Key 前缀
     */
    String USER_SIGN_IN_REDIS_KEY_PREFIX = "user:signins:";


    /**
     * 获取用户签到记录 Redis Key
     * @param year
     * @param userId
     * @return
     */
     static String getUserSignInRedisKeyPrefix(int year, long userId){
        return String.format("%s:%s:%s", USER_SIGN_IN_REDIS_KEY_PREFIX, year, userId);
    }

}
