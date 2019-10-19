本次作业实验环境：
> win10 ; jdk.17 ; soot-2.5.0

源代码：
```java
public class test{
    int x;
    int y;
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        a = a+b; // 此处地址发生了改变(基本类型)
        test c=new  test();
        c.x=a;
        c.y=b;
        c.x=c.x+c.y; //此处地址没有发生改变（对象类型）
        return;
    }

}
```

使用的命令：`PS D:\code\SoftwareAnalysis\SSA_homework> java -cp .\soot-2.5.0.jar soot.Main -cp ".;.\rt.jar" -f S test`

使用soot 经过SSA优化后的Shimple 文件：

```java
public class test extends java.lang.Object
{
    int x;
    int y;

    public static void main(java.lang.String[])
    {
        java.lang.String[] args;
        int a, b, temp$0, temp$1, temp$3, temp$4, temp$5, a_1;
        test c, temp$2;

        args := @parameter0: java.lang.String[];
        a = 1;
        b = 2;
        temp$0 = a;
        temp$1 = temp$0 + b;
        a_1 = temp$1; // 地址改变
        temp$2 = new test;
        specialinvoke temp$2.<test: void <init>()>();
        c = temp$2;
        c.<test: int x> = a_1;
        c.<test: int y> = b;
        temp$3 = c.<test: int x>;
        temp$4 = c.<test: int y>;
        temp$5 = temp$3 + temp$4;
        c.<test: int x> = temp$5;//地址不变
        return;
    }

    public void <init>()
    {
        test this;

        this := @this: test;
        specialinvoke this.<java.lang.Object: void <init>()>();
        return;
    }
}

```