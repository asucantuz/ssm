import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Optional;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Ordering;
import org.junit.Test;

import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by tianf on 2016/8/3.
 */



public class TestGuava {

    Logger logger = Logger.getLogger(TestGuava.class.getName());

    ConcurrentHashMap concurrentHashMap;

    @Test
    public void test() {

       // 1.1 使用和避免null：null是模棱两可的，会引起令人困惑的错误，
        // 有些时候它让人很不舒服。很多Guava工具类用快速失败拒绝null值，而不是盲目地接受
        Optional<Integer> possible1 = Optional.of(5);
         Boolean b=possible1.isPresent(); // returns true
         //possible1.get(); // returns 5
        logger.info(b.toString());
        logger.info(possible1.get().toString());


        //1.2 前置条件: 让方法中的条件检查更简单
//        Integer inte=checkNotNull(null);
       // logger.info(inte.toString());
    }


    @Test
    public void test1() {
        //1.3 常见Object方法: 简化Object方法实现，如hashCode()和toString()

        //equals
        Objects.equal("a", "a"); // returns true
        Objects.equal(null, "a"); // returns false
        Objects.equal("a", null); // returns false
        Objects.equal(null, null); // returns true


        //hashCode
        Person p = new Person("Joe Q Author", 42, 173, 82, "Brown", "MALE");
        Integer hashCode=Objects.hashCode(p.getName(),p.getAge(),p.getHeight(),p.getWeight(),p.getEyeColor(),p.getGender());
        logger.info(hashCode.toString());

       // toString

        // Returns "ClassName{x=1}"
       // Objects.toStringHelper(this).add("x", 1).toString();
// Returns "MyObject{x=1}"
        //Objects.toStringHelper("MyObject").add("x", 1).toString();
        logger.info(p.toString());      //Person{name=Joe Q Author, age=42}



        //compare/compareTo
        Person p1 = new Person("Joe Q Author", 40, 173, 82, "Brown", "MALE");
        Integer com=p.compareTo(p1);
        logger.info(com.toString());


        //1.4 排序: Guava强大的”流畅风格比较器”

        /*Ordering<Person> ordering = Ordering.natural().nullsFirst().onResultOf(new Function<Person, String>() {

            public String apply(Person person) {

                return person.getName();

            }

        });*/


    }


    public void test3() {

        //1.5 Throwables：简化了异常和错误的传播与检查

        //2.1 不可变集合: 用不变的集合进行防御性编程和性能提升。

        //2.2 新集合类型: multisets, multimaps, tables, bidirectional maps等

        //2.3 强大的集合工具类: 提供java.util.Collections中没有的集合工具

       // 2.4 扩展工具类：让实现和扩展集合类变得更容易，比如创建Collection的装饰器，或实现迭代器

    }



























}
