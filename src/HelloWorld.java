/**
 * 文档注释，也叫类注释或方法体注释
 * public : 公有的，由它修饰的类就是公有类，private私有的
 * class : 关键字标记一个标识符为一个类
 * HelloWorld : 自定义的类名 规范： 第一个单词的首字母一定大写，之后单词的首字母也要大写
 * {} ： 类体，作用域
 * main: 方法
 */
public class HelloWorld{

    public static void main(String[] args){
		/*
		块注释，编写了一些代码调试的时候不需要的时候
		static : 关键字 静态的 
		void : 返回类型 空 
		main : 方法名 ， 规范 驼峰命名法 ，首字母通常小写，之后的单词的首字母大写。若你想标记为主函数，那这个函数名称就只能是main
		() : 函数，方法 存放参数的 
		String ：数据类型，引用数据类型
		[] : 数组标记 ，里面存放的都是字符串类型 
		args : 形式参数 简称形参  ，任意
		{} : 方法体 ， 作用域
		int a = 10;
		int b = 20;*/

        //System.out.println("hello , world!!!");
        //单行注释，仅注释一行System 系统对象类 System.out.println("hello , world!!!")输出打印语句 "" ''英文输入法下的
    }

    public int testMethod(){
        int a = 10;
        return a;
    }
}