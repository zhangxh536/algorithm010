学习笔记
一、数据结构与算法总览
1、chunk it up 切碎知识点
 把知识点弄成脑图,通过把知识点的理解和学习归结成一个树型结构

数据结构分类
1、按总体分类，八大数据结构
数组、链表、栈、队列、散列表、树、图、堆
2、按照维度来分类
1> 一维
基础: 数组(array)、链表(linked list)、
高级: 栈(stack)、队列(queue)、双端队列(deque)、集合(set)、映射(散列表)
(map)
2> 二维
基础:树 tree 图 graph
高级:从树型的基础上加了很多的条件判断
    二叉搜索树 binary search tree(red-black tree、AVL)
    堆 heap,并查集 disjoint set,字典树 Trie

算法的基础语法结构
初级:
1、if else, switch --> branch 跳转
2、for while loop --> Iteration 循环
3、递归 Recursion (Divide 、Conquer,Backtrace)
最终目的:找重复的单元
-----------------------------------------------
高级:
4、搜索
深度优先算法:Depth first search
广度优先算法:Breadth first search
5、动态规划
Dynamic programming
6、二分查找
Binary search
7、贪心算法
Greedy
8、数学 Math
   几何 Geometry

2、Deliberate Practicing 刻意练习
刻意练习---过边数(五步刷题法)
练习弱点、踏出舒适区

3、Feedback 反馈
即使反馈

主动型反馈(自己去找)
1>高手代码
2>直播

被动反馈
code review
教练打看反馈

切题四件套
1> Clarification 确定题目无错
2> Possible solutions 想各种可能
   compare (time/space)
   optimal (加强)
3> Coding(多写)
4> Test cases(测试样例)

五遍刷题法
一遍:
5分钟:读题+思考
直接看解法:比较优劣 
背诵和默写
二遍:
马上自己写-->
多种解法优化
三遍:
24小时后写一遍
四遍:
过了一周反复练习相同的题目
五遍:
面试前进行练习 

二、训练准备和复杂度分析
1、训练准备
自顶向下的编程方式
先把逻辑写清楚
设置合适的代码习惯和操作键位

2、时间复杂度和空间复杂度
基本操作所运行的次数所使用的时间
1> 七种时间复杂度
O(1):constant complexity 常数复杂度
O(log(n)):logarithmic complexity 对数复杂度
O(n):linear complexity 线性时间复杂度
O(n^2): n square complexity 平方
O(n^3):n cubic complexity 立方
O(2^n):exponential growth 指数级别
O(n!):factorial 阶乘

2> 复杂度分析
主定理分析递归复杂度
四种递归分析：
二分查找:只查一边,时间复杂度O(log(n));
二叉树遍历:遍历每个节点,时间复杂度O(n);
排序的二维矩阵二分查找:O(n);
归并排序:O(nlog(n))

3> 空间复杂度
1、常量空间 O(1)
2、线性空间 O(n)
3、二维空间 O(n^2)
4、递归空间 O(n)

二、数组、链表、跳表
1、数组
1> 数组是有限个相同类型的变量所组成的有序集合
2> 底层是以开辟连续的内存地址进行实现的
3> 插入和删除的时间复杂度是O(n),头尾插入O(1);可以理解为军训时候的排队入列和出列
或者是图书馆排好序且每本图书都有自己的编号位置地址,所以查询的时间复杂度是O(1);

2、链表
1> 链表在物理上是非连续、非顺序的数据结构,由若干个节点(node)组成
具有头节点head,尾节点tail,尾节点指向null
2> 单向链表每一个节点包含两个部分,一部分是存放数据变量data,另一个部分是存储指向
下一个节点的指定next
private static class Node {
    int data;
    Node next;
}
3> 双向链表,具有prev指向前一个节点;
4> 循环链表 尾指针指向头节点;
java中的linklist是一个标准的双向链表
链表好比是电梯一样,到达下一层必须经过上一层

3、跳表
1> 跳表的本身基于链表是一种特殊的数据结构,对表的是平衡树和二分查找
插入删除搜索都是O(logn)的数据结构
2> 特点:只能用于链表里的元素是有序的情况下,使用必须有序
3> 查找加速:升维添加索引
4> 时间复杂度为O(logn)、空间复杂度为O(n)
5> 跳表的索引维护成本较高,每删除和更新索引其他的都要全部更新一遍。
跳表好比是单、双层电梯,每两层停一次一样