import org.junit.Test;

/**
 * 文档注释，也叫类注释或方法体注释
 * public : 公有的，由它修饰的类就是公有类，private私有的
 * class : 关键字标记一个标识符为一个类
 * HelloWorld : 自定义的类名 规范： 第一个单词的首字母一定大写，之后单词的首字母也要大写
 * {} ： 类体，作用域
 * main: 方法
 */
public class HelloWorld{
    private static int b;//成员变量 、全局变量 堆（heap ） ，有默认值
    private static String str2;

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
        //b = 20;
        System.out.println(b);
        System.out.println(str2);
        testFn();
    }

    public int testMethod(float d){
        int a = 10;//定义在方法里的称为局部变量,特点只能在自己的作用域里面使用
        //内存：栈内存（stack）
        System.out.println("testMethod" + a);
        return a;
    }

    /**
     * 标识符命名规范:
     * 1、不能以数字开头
     * 2、区分大小写
     * 3、不能是关键字或保留字 (goto , const)
     * 4、由字母、数字、下划线（_）和美元符号（$）组成。
     */
    public static void testFn(){
        String str = "";//引用数据类型 ,局部变量没有默认值
        String _test = "";
        int $ss = 10;
        int hello威哥 = 20; //ASCII ，utf-8 码
        System.out.println(hello威哥);
    }
    /**
     * 八种基本数据类型
     * boolean : 布尔型 不定值  false
     * short : 短整型  2   0
     * int : 整型  4      0
     * long : 长整型  8    0
     * float : 单精度浮点型  4   0.0
     * double : 双精度浮点型  8  0.0
     * char : 字符型  2   '\u0000'
     * byte : 字节型  1   0
     */
    private float f = 0.2f;
    private double d = 0.2d;
    private char c = 'c';
    private char chinese = '中';

    @Test
    public void testFn2(){
        System.out.println(chinese);
        testMethod(0.5f);
    }
}