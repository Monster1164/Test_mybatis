import com.cb.dao.ClassMapper;
import com.cb.dao.OrderMapper;
import com.cb.dao.Usermapper;
import com.cb.pojo.Classes;
import com.cb.pojo.Order;
import com.cb.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class test {

    public static void main(String[] args) {

        //加载配置文件
        String resource = "mybatis_cfg.xml";
        InputStream inputStream =null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //创建工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //创建sqlsession
        SqlSession sqlSession = sessionFactory.openSession();
        //执行映射
        Usermapper mapper = sqlSession.getMapper(Usermapper.class);
//        User user = mapper.selectUser(1);

//        System.out.println(user);

        //插入用户 插入成功输入1
//       插入成功输入1 User user1 = new User();
//        user1.setAge(20);
//        user1.setName("你的好妈妈");
//        int add = mapper.add(user1);
//        sqlSession.commit();
//        sqlSession.close();
//        System.out.println(add);

        //更新用户
//        User user1 = new User();
//        user1.setId(8);
//        user1.setName("我是大哥");
//        user1.setAge(25);
//
//        int update = mapper.update(user1);
//        System.out.println(update);

        //删除用户
//        int delete = mapper.delete(8);
//        System.out.println(delete);
//        sqlSession.commit();
//        sqlSession.close();

        //查询所有
//        List<User> all = mapper.getAll();
//        System.out.println(all);
//        sqlSession.commit();
//        sqlSession.close();
        //字段跟实体属性不一样
//        OrderMapper mapper1 = sqlSession.getMapper(OrderMapper.class);
//        Order order = mapper1.selectById(1);
//        System.out.println(order);

        //一对一 班级对学生
//        ClassMapper mapper1 = sqlSession.getMapper(ClassMapper.class);
//        Classes classes = mapper1.selectCT(1);
//        System.out.println(classes);
//        sqlSession.close();

        //一对多 班级对多个学生
        ClassMapper mapper1 = sqlSession.getMapper(ClassMapper.class);
        Classes classes = mapper1.selectCTS(1);
        System.out.println(classes);
        sqlSession.close();

    }
}
