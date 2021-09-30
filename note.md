##常用依赖
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>5.2.0.RELEASE</version>
        </dependency>

        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>1.18.10</version>
        </dependency>

        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
        </dependency>
##注解说明
@Autowired 自动注入默认是通过byType 再是通过byName
@Resource  自动注入默认是byName 再是byType
@Component 组件 放在一个类上面的话 就说明这个类被spring管理了，就是bean
