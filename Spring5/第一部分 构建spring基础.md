# 第一章 spring起步

## 1.1 什么是spring

1. spring的核心是提供了一个容器,通常成为spring应用上下文,他们会创建和管理应用组件,这些组件称之为bean.
2. Bean的装配
   >> 显示配置
   1. xml配置
   ```xml
   <bean id="" class=""/>
   <bean id="" class="">
    <constructor-arg ref="beanid">
   <bean/>
   ```
   1. java配置
    ```java
    @Configration
    public class A {
        @Bean
        public Apple apple() {
            return new Apple();
        }
    }
    // 默认方法名是bean的id
    ```
    以上两种配置方式是显示配置,只有在自动配置不能生效的时候才这样使用

    >> 自动配置

    自动配置起初是以自动装配(AutoWiring)和组件扫描(Component Scanning)作为体现.
    但是在springboot中自动配置的能力已经大幅度超过了以上两方面,springboot可以基于类路径中的条目,环境变量,和其他因素合理猜测需要配置的组件并将他们合理的组装在一起.

## 1.2 初始化spring应用
 我用idea 这里不再赘述

 创建完成后我们需要注意一下信息
 1. 基本上和maven的目录结构相似,resource中存放template和static,application.properties的非java代码
 2. 自动创建了类 应用名+Application,这是应用主类他会启动该项目 
 3. application.properties 这个文件起初是空的,但是他为我们指定了配置属性的地方,第四章会详细介绍
 4. static 存放为浏览器提供服务的静态内容(图片,css,js)
 5. templates 存放模板文件
 6. 自动创建了一个测试类,他能确保spring应用上下文可以正确加载.

>> 引导应用

1. @SpringBootApplication注解
   1. 表明这是一个springboot应用
   2. 包含了一下三个注解
      1. springbootConfigration 将该类生命为配置类
      2. EnableAutoConfiguration 启用springboot的自动配置
      3. ComponentScan 启用组件扫描

## 1.3 编写spring应用

1. 我们需要添加一个主页
   1. 添加一个控制器类
   2. 一个视图模板
2. SpringMVC
   1. 编写一个控制器处理对根路径的请求(将请求转发至主页视图)
   ```java
   @Controller /相当于bean
    public class HomeController {
    
    @GetMapping("/")  //如果有针对"/"发起GET请求那么他会响应
    public String home() {
        return "home"; // 这个值会被解析为视图的逻辑名(当然也可以直接作为json返回忘了怎么做了)
    }
    }
   ```
   2. 写一个视图模板
      1. 为什么用thymeleaf 容易与springboot进行配合
      2. 模板名由逻辑视图名派生而来
      3. 代码
    ```html
    <!DOCTYPE html>
    <html xmlns="http://www.w3.org/1999/xhtml"
        xmlns:th="http://www.thymleaf.org">
    <head>
        <title>Taco</title>
    </head>
    <body>
        <h1>欢迎来到Taco home</h1>
        <img th:src="@{/images/taco.png}"/>
    </body>
    </html>
    ```
    3. 构建和运行应用
   直接运行引导类就行了
   ### 1.3.1 了解spring boot devTools

   1. 应用自动重启 
      1. src/main下的内容发生变化后会重启应用
      2. 不会对依赖项进行检测依赖项
   2. 浏览器自动刷新,禁用模板缓存
   3. 内置h2控制台

    ### 回顾   
    不用写web.xml了?哈哈哈哈哈哈哈哈
## 1.4 俯瞰spring风景线

1. spring核心框架
   1. 核心框架是spring领域中的基础,他提供了核心容器,以及依赖注入框架.
   2. springmvc spring的web框架
2. springboot
3. springData
4. springSecurity
5. springCloud

# 第二章 开发Web应用
