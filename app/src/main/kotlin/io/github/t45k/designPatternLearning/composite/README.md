# Composite パターン

### 容器と中身の同一視

木構造の節と葉を同じクラスとして見ることで、「節は節または葉を複数持てる」というルールを節か葉を気にすることなくじっそうできる。

基本的に全ての木構造に使える

## 関連しているパターン
- Command
  - Commandパターンで「マクロコマンド」を作るときに、Compositeパターンが使える
  - 「マクロコマンド」は多分よく聞くマクロと相違なさそう
- Visitor
  - 木構造を渡り歩くときに使える
- Decorator
  - Compositeでは容器と中身を同一視する
  - Decoratorパターンは、飾りと中身を同一視する
