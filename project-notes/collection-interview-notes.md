# Collections Interview Notes

## ArrayList
- `ArrayList` 底层是动态数组。
- 优点：按下标访问快，`get(index)` 通常是 O(1)。
- 缺点：中间插入或删除可能需要移动元素。
- 扩容：容量不够时会创建更大的数组，并复制旧元素。

## LinkedList
- `LinkedList` 底层是双向链表。
- 优点：在已知节点位置时插入和删除方便。
- 缺点：按下标访问需要遍历，`get(index)` 通常是 O(n)。

## HashMap
- `HashMap` 使用 key-value 存储数据。
- 常用操作：`put`、`get`、`containsKey`。
- 优点：根据 key 查找通常很快。
- 注意：key 不能只靠对象地址理解，后面要学习 `equals` 和 `hashCode`。