package redis;

import com.zaqbest.base.demo.ZaqDemoCacheApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest(classes = ZaqDemoCacheApplication.class)
@TestPropertySource(locations={"classpath:application.yaml"})
public class BaseTest {
}
