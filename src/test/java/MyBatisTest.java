import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.caisezhaopian.SSMWebDemo.dao.AccountDao;
import org.caisezhaopian.SSMWebDemo.entity.Account;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest {

    @Test
    public void testMyBatis() throws IOException {
        //获取SqlMapConfig.xml字节输入流
        InputStream is = Resources.getResourceAsStream("config/mybatisConfig.xml");

        //获取SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

        //创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = builder.build(is);

        //创建sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
        Account accc = new Account(16,"qw", 12L);
        accountDao.add(accc);
        //查询所有
        List<Account> accounts = accountDao.list();
        for (Account account : accounts) {
            System.out.println(account);
            System.out.println(account.getName());
        }

        //关闭资源
        sqlSession.close();
    }
}