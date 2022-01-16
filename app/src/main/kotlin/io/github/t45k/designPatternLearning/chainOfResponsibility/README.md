# Chain of Responsibility pattern

### 責任のたらい回し

1. Handlerのフィールドに次のHandlerを持す
2. 処理に失敗したら自分のフィールド変数であるHandlerに処理を投げる
3. 要求を出す側が処理する側のことを考えなくてよくなる

## 関連しているパターン
- Composite
  - Handler役としてCompositeパターンが出てくる
- Command
  - Handlerに投げられる「要求」には、Commandパターンが使われる
