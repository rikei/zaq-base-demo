package redis;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.redisson.api.LocalCachedMapOptions;
import org.redisson.api.RLocalCachedMap;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ZaqDemoRedissonTest extends BaseTest{
    @Autowired
    private RedissonClient redissonClient;

    @Test
    public void test(){
        LocalCachedMapOptions<String, String> options = LocalCachedMapOptions.defaults();
        options.cacheSize(200);
        options.evictionPolicy(LocalCachedMapOptions.EvictionPolicy.LRU);
        RLocalCachedMap<String, String> localCachedMap =
                redissonClient.getLocalCachedMap("myCache", LocalCachedMapOptions.defaults());

        localCachedMap.put("aa", "a1111");
        String value = localCachedMap.get("aa");
        System.out.println(value);
    }

}
