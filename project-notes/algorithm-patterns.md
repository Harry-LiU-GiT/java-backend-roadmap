# Algorithm Patterns

## Sliding Window

### 适用场景
- 连续子数组
- 连续子串
- 需要维护一个动态区间

### 常见变量
- `left`：窗口左边界
- `right`：窗口右边界
- `set` / `map`：维护窗口内的字符、数字或计数

### 模板思路
- 右指针不断扩展窗口
- 如果窗口不满足条件，就移动左指针缩小窗口
- 每一步更新答案

### 例题
- Longest Substring Without Repeating Characters

## Two Pointers

### 适用场景
- 排序数组
- 两数/三数求和
- 原地移动元素
- 链表快慢指针

### 常见变量
- `left`
- `right`
- `slow`
- `fast`

### 模板思路
- 根据当前状态决定移动哪个指针
- 排序数组中，和太小移动 `left`，和太大移动 `right`
- 链表中，`fast` 每次走两步，`slow` 每次走一步

### 例题
- Move Zeroes
- Three Sum
- Linked List Cycle