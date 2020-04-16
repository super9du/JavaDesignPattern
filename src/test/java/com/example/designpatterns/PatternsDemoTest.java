package com.example.designpatterns;

import com.example.designpatterns.model.Http;
import com.example.designpatterns.model.IHttp;
import com.example.designpatterns.model.NoInterfaceAndFatherClass;
import com.example.designpatterns.patterns.behavioral.chainofresponsibility.SearchContext;
import com.example.designpatterns.patterns.behavioral.chainofresponsibility.okhttp.OkEmailSearchChain;
import com.example.designpatterns.patterns.behavioral.chainofresponsibility.okhttp.OkIPSearchChain;
import com.example.designpatterns.patterns.behavioral.chainofresponsibility.okhttp.OkManageChain;
import com.example.designpatterns.patterns.behavioral.template.JingDongShopping;
import com.example.designpatterns.patterns.behavioral.template.TaoBaoShopping;
import com.example.designpatterns.patterns.other.cjlibproxy.CjlibProxy;
import com.example.designpatterns.patterns.structural.adaptor.HomePowerSupplier;
import com.example.designpatterns.patterns.structural.adaptor.Phone;
import com.example.designpatterns.patterns.structural.adaptor.PhoneAdaptor;
import com.example.designpatterns.patterns.structural.bridge.*;
import com.example.designpatterns.patterns.structural.decorator.*;
import com.example.designpatterns.patterns.structural.facade.Facade;
import com.example.designpatterns.patterns.structural.facade.FacadeImpl;
import com.example.designpatterns.patterns.structural.proxy.DynamicProxyPro;
import com.example.designpatterns.patterns.structural.proxy.HttpDynamicProxy;
import com.example.designpatterns.patterns.structural.proxy.HttpProxy;
import org.junit.jupiter.api.Test;

/**
 * Demo PatternsDemoTest
 *
 * @author Wolf-Liu
 * @date 2019/12/3 23:23
 */
public class PatternsDemoTest {

    /**
     * 仿照 okhttp 的 interceptor 创建的 chain
     */
    @Test
    void okChainTest() {
        OkManageChain okManageChain = new OkManageChain()
                .add(new OkIPSearchChain())
                .add(new OkEmailSearchChain());
        String found = okManageChain.search("iam.hugeman4@qq.com", okManageChain);
        System.out.println(found);
        System.out.println("=================================");
        String found1 = okManageChain.search("go-top.xyz", okManageChain);
        System.out.println(found1);
        System.out.println("=================================");
        String found2 = okManageChain.search("127.0.0.1", okManageChain);
        System.out.println(found2);
    }

    /**
     * 自定义责任链模式
     */
    @Test
    void chainOfResponsibilityTest() {
        new SearchContext().search("iam.hugeman4@qq.com");
        System.out.println("=================================");
        new SearchContext().search("go-top.xyz");
        System.out.println("=================================");
        new SearchContext().search("127.0.0.1");
    }

    /**
     * cjlib 动态代理
     */
    @Test
    void cjlibProxy() {
        NoInterfaceAndFatherClass proxy = new CjlibProxy<>(NoInterfaceAndFatherClass.class)
                .getProxyInstance();
        proxy.hello("message");
    }

    /**
     * 动态代理升级版
     */
    @Test
    void dynamicProxyPro() {
        IHttp http = new Http();
        IHttp httpProxy = new DynamicProxyPro<>(http).getProxyInstance();
        String send = httpProxy.sendMsg("test-------------");
        String receive = httpProxy.receiveMsg(send);
    }

    /**
     * 全透明装饰模式（「增强方法型」）
     */
    @Test
    public void decoratorPatternDemoOne() {
        Person person = new Person();
        System.out.println("普通人的魅力值为：" + person.getCharisma());

        TallPerson tallPerson = new TallPerson(person);
        System.out.println("高人的魅力值为：" + tallPerson.getCharisma());

        HandsomePerson handsomePerson = new HandsomePerson(person);
        System.out.println("帅人的魅力值为：" + handsomePerson.getCharisma());

        RichPerson richPerson = new RichPerson(person);
        System.out.println("富人的魅力值为：" + richPerson.getCharisma());

        RichPerson tallRichHandsomePerson = new RichPerson(new TallPerson(new HandsomePerson(person)));
        System.out.println("高富帅的魅力值为：" + tallRichHandsomePerson.getCharisma());
    }

    /**
     * 半透明装饰模式（「增加功能型」或「增强方法与增加功能二合一型」）
     */
    @Test
    public void decoratorPatternDemoTwo() {
        Person person = new Person();
        FemalePerson femalePerson = new FemalePerson(person);
        MalePerson malePerson = new MalePerson(person);
        FemalePerson malePerson2femalePerson = new FemalePerson(new MalePerson(person));

        System.out.println("女性的魅力值为：" + femalePerson.getCharisma());
        System.out.println("女性的能力为：" + femalePerson.combHairs());

        System.out.println("男性的魅力值为：" + malePerson.getCharisma());
        System.out.println("男性的能力为：" + malePerson.shaveBeard());

        System.out.println("人妖的魅力值为：" + malePerson2femalePerson.getCharisma());
        System.out.println("人妖的能力为：" + malePerson2femalePerson.combHairs());
        //System.out.println("男性变为女性的能力为："+malePerson2femalePerson.shaveBeard());//不能使用
    }

    @Test
    public void facadePatternDemo() {
        Facade facade = new FacadeImpl();
        facade.methodA();
        System.out.println("-------------");
        facade.methodB();
    }

    @Test
    public void staticProxyPatternDemo() {
        System.out.println("====静态代理模式====");
        HttpProxy httpProxy = new HttpProxy(new Http());
        httpProxy.receiveMsg(httpProxy.sendMsg("静态代理测试"));
    }

    @Test
    public void dynamicProxyPatternDemo() {
        System.out.println("====动态代理模式====");
        IHttp proxy = new HttpDynamicProxy().getInstance(new Http());
        proxy.receiveMsg(proxy.sendMsg("动态代理测试"));
    }

    @Test
    public void templateMethodPatternDemo() {
        JingDongShopping jingDongShopping = new JingDongShopping();
        jingDongShopping.doShopping();
        System.out.println("=================");
        TaoBaoShopping taoBaoShopping = new TaoBaoShopping();
        taoBaoShopping.doShopping();
    }

    @Test
    public void bridgePatternDemo() {
        Shape square = new Square(new Red());
        square.draw();
        System.out.println("================");
        Shape triangle = new Triangle(new Yellow());
        triangle.draw();
    }

    @Test
    public void adaptorPatternDemo() {
        Phone phone = new Phone();
        HomePowerSupplier homePowerSupplier = new HomePowerSupplier();
        phone.charge(homePowerSupplier.powerSupply());
        System.out.println("==============");
        PhoneAdaptor adaptor = new PhoneAdaptor();
        phone.charge(adaptor.converter(homePowerSupplier.powerSupply()));
    }
}
