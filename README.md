# Java Backend Roadmap

## Day 1 - 环境与 Java 基础

### 今日完成
- 安装并验证 JDK 17
- 安装 IntelliJ IDEA
- 运行 Hello Java
- 练习变量、if/else、for 循环
- 完成 Two Sum 暴力解法
- 完成 Valid Parentheses 栈解法

### 代码文件
- `Main.java`：Java 基础语法练习
- `TwoSum.java`：两数之和
- `ValidParentheses.java`：有效的括号

### 今日复盘
- Java 程序从 `public static void main(String[] args)` 开始执行
- `String` / `int` / `boolean` 是今天用到的基础类型
- 数组下标从 0 开始
- `Stack` 的特点是后进先出

## Day 2 - 数组、字符串与方法

### 今日完成
- 练习数组方法：最大值、求和
- 练习 `String` 常用方法：`length()`、`charAt()`、`toUpperCase()`
- 练习 `StringBuilder` 拼接字符串
- 完成 `ArrayUtils` 和 `StringUtils`
- 完成 Move Zeroes
- 完成 Merge Two Sorted Lists
- 复盘 HashMap 解 Two Sum 的思路

### 代码文件
- `Day2Basics.java`：数组、字符串和 `StringBuilder` 基础练习
- `ArrayUtils.java`：数组工具方法
- `StringUtils.java`：字符串工具方法
- `MoveZeroes.java`：移动零
- `MergeTwoLists.java`：合并两个有序链表

### 今日复盘
- 数组通过下标访问，`nums.length` 表示数组长度
- `String` 是不可变的，`toUpperCase()` 会返回新字符串
- `StringBuilder` 适合频繁拼接，最后可用 `toString()` 转回字符串
- Move Zeroes 使用 `insertPos` 记录下一个非零元素应该放置的位置
- 链表节点由 `val` 和 `next` 组成，dummy 节点可以简化头节点处理
- HashMap 解 Two Sum 可以用空间换时间，把复杂度从 `O(n²)` 降到 `O(n)`

## Day 3 - 面向对象基础

### 今日完成
- 创建 `User` 实体类，练习 `private` 属性、构造器、getter/setter
- 创建 `Order` 实体类，练习订单字段建模
- 创建 `Task` 实体类，练习 `boolean` 属性和 `isCompleted()`
- 使用 `Day3OopDemo` 测试对象创建和属性访问
- 完成 Reverse Linked List
- 完成 Linked List Cycle

### 代码文件
- `User.java`：用户实体类
- `Order.java`：订单实体类
- `Task.java`：任务实体类
- `Day3OopDemo.java`：面向对象练习入口
- `ReverseList.java`：反转链表
- `LinkedListCycle.java`：环形链表

### 今日复盘
- 类是对象的模板，对象是类创建出来的具体实例
- 属性用于保存对象的数据，也叫字段或成员变量
- 构造器用于创建对象时初始化属性，名字必须和类名一致
- 封装：把对象的属性隐藏起来，通过 `public` 方法提供受控访问
- 继承：子类复用父类已有的属性和方法，并且可以扩展自己的能力
- 多态：父类引用可以指向不同子类对象，同一个方法调用在不同对象上表现不同
- 反转链表的关键是保存 `next`、反转 `current.next`、移动 `prev/current`
- 环形链表使用快慢指针，`fast` 和 `slow` 相遇说明存在环

## Day 4 - 集合框架入门

### 今日完成
- 练习 `ArrayList` 的 `add`、`get`、`set`、`remove`、`size`
- 练习 `HashMap` 的 `put`、`get`、`containsKey`
- 练习 `HashSet` 的 `add`、`contains`、去重特性
- 练习 `LinkedList` 的 `add`、`getFirst`、`removeFirst`
- 完成 Group Anagrams
- 完成 Longest Consecutive Sequence
- 实现命令行 TodoList v0.1 的添加、删除、查询

### 代码文件
- `Day4CollectionsDemo.java`：集合基础练习
- `GroupAnagrams.java`：字母异位词分组
- `LongestConsecutive.java`：最长连续序列
- `TodoListApp.java`：命令行 TodoList v0.1

### 今日复盘
- `ArrayList` 底层是动态数组，适合按下标快速访问
- `LinkedList` 底层是双向链表，适合在已知节点位置时插入和删除
- `HashMap` 用 key-value 存储数据，适合按 key 快速查找
- `HashSet` 只保存不重复元素，适合去重和快速判断是否存在
- Group Anagrams 使用排序后的字符串作为 key，把同类单词放进同一个列表
- Longest Consecutive 使用 `HashSet` 快速判断数字是否存在，只从序列起点开始计数
- TodoList v0.1 使用 `ArrayList<String>` 保存任务，注意用户编号和数组下标相差 1

## Day 5 - 异常、泛型与简单 IO

### 今日完成
- 练习 `try/catch/finally` 捕获除零异常
- 创建自定义异常 `InvalidTaskException`
- 练习泛型方法 `printArray(T[] array)`
- 使用 `Files.writeString` 和 `Files.readString` 完成简单文件读写
- 实现 TodoList v0.2 文件持久化
- 完成 Longest Substring Without Repeating Characters
- 完成 Valid Anagram

### 代码文件
- `Day5ExceptionDemo.java`：异常处理练习
- `InvalidTaskException.java`：自定义任务异常
- `Day5GenericDemo.java`：泛型方法练习
- `Day5FileDemo.java`：简单文件读写练习
- `TodoListFileApp.java`：TodoList v0.2 文件持久化
- `LongestSubstringWithoutRepeating.java`：最长无重复子串
- `ValidAnagram.java`：有效的字母异位词

### 今日复盘
- `try/catch` 可以捕获异常，避免程序直接崩溃
- `finally` 不管是否发生异常都会执行，常用于释放资源
- 自定义异常可以表达业务错误，比如任务标题不能为空
- 泛型方法通过 `<T>` 让同一个方法支持多种类型
- `String` 不可变，滑动窗口中用 `HashSet<Character>` 维护当前窗口字符
- 文件持久化就是把内存中的任务写入文件，下次再从文件读回
- Valid Anagram 可以通过排序后比较两个字符数组解决

