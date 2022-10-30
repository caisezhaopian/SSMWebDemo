import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMyBatisTest {
    /***
     * 测试Spring和MyBatis集成
     * 如果给每个Dao生成了代理对象，则表示集成成功
     */
    @Test
    public void testSpringMyBatis(){
        ApplicationContext act = new ClassPathXmlApplicationContext("config/springContext.xml");
        //获取容器中所有Bean的名字
        String[] names = act.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
}