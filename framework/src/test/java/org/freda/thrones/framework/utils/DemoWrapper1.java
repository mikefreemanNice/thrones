package org.freda.thrones.framework.utils;


/**
 * Create on 2018/9/7 17:04
 */
@Order(1)
public class DemoWrapper1 implements DemoService {

    private DemoService demoService;

    public DemoWrapper1(DemoService demoService) {
        this.demoService = demoService;
    }

    @Override
    public String echo(String str) {
        System.out.println(this.getClass().getSimpleName());
        return demoService.echo(str);
    }

    @Override
    public void print(String str) {

    }
}
