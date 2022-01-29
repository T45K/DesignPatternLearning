# Command pattern

### 命令をクラスにする

- 命令自体をクラスで表現して、`execute`メソッドで実行する
- JGitとかでよく見るやつ

## 関連しているパターン
- Composite
  - マクロコマンドはCompositeで表現できる
- Memento
  - 履歴を残せる
- Prototype
  - 命令を複製したいときに使える
