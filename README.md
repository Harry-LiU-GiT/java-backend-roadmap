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
