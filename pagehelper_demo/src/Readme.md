### 前言
主要是用于搭配mybatis使用，和mybatis-plus冲突
### pagehelper使用

1.引入依赖
```xml
<!-- Pagehelper -->
<dependency>
	<groupId>com.github.pagehelper</groupId>
	<artifactId>pagehelper-spring-boot-starter</artifactId>
	<version>1.4.1</version>
</dependency>
```
2.方法前调用
在你需要进行分页的 MyBatis 查询方法前调用 PageHelper.startPage 静态方法即可，紧跟在这个方法后的第一个MyBatis 查询方法会被进行分页。
```java
#参数1:pageNum(从1开始),参数2：pageSize,默认查询总数count
PageHelper.startPage(2, 3);
List<User> list = userService.queryList();
```
### 其他
1.分页信息
```java
#可以通过pageinfo对象获取分页信息，如总数total等
PageInfo page = new PageInfo(list);
```
2.安全调用
param参数可能null线程不安全，startPage()方法必须在内部
```java
List<Country> list;
if(param1 != null){
    PageHelper.startPage(1, 10);
    list = countryMapper.selectIf(param1);
} else {
    list = new ArrayList<Country>();
}
```

### 参考
https://pagehelper.github.io/docs/howtouse/
