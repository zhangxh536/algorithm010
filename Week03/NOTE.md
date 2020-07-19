学习笔记
一、泛型递归、树的递归
  1、树的题目一般用递归来解决,递归的问题就是不断找寻最近重复子问题;
  java的模版
  
  public void recur(int level,int param) {
    //terminator终结递归的条件
    if (level > max_level) {
        return;
   }
    //process current 
    process(level,param);
    //drill dowm
    recur(level + 1,newParam);
  } 
   2、递归中需要注意的点
    1> 不要人肉递归
    2> 找到最近重复子问题
    3> 数学归纳法思想

二、分治、回溯
    1、分治 
    1> 也是一种递归,是一种递归状态树,在其递归的时候将问题分解成不同的子问题;
    2> 和递归有区别的的是在drill dowm的时候把得到的子结果要合并在一起并且返回;
    2、回溯
    1> 回溯方法的思想是采用试错的形式,分布去解决一个问题。
