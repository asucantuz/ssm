import com.szkingdom.ssm.dao.IAccountDao;
import com.szkingdom.ssm.entity.Account;
import com.szkingdom.ssm.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by tian on 2016/7/30.
 */


@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestMybatis {

    private final Logger LOG = LoggerFactory.getLogger(this.getClass());

    @Autowired
   /* private IAccountService accountService;*/
    private IAccountDao accountDao;


    @Autowired
    private IAccountService accountService;


    @Test
    public void loginDaoTest() {

        Account account=new Account();
        account.setAccLogin("admin");

       Account account1= accountDao.login(account);
        LOG.info(account1.toString());

    }

    @Test
    public void loginServiceTest() {

        Account account=new Account();
        account.setAccLogin("admin");

        Account account1= accountService.loginService(account);
        LOG.info(account1.toString());

    }





}
