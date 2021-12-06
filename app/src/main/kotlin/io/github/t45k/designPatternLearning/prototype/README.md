# Prototypeパターン

### コピーしてインスタンスを作る

- Flyweightパターンみたいな感じ
  - 向こうが一つのインスタンスを使いまわす
  - Prototypeは`Object#clone`を呼んでコピーしたインスタンスを返す
- オブジェクト生成にクラス名を用いないので，依存が減る

## 関連するパターン
- Flyweight
- Memento
  - Mementoパターンでは現在のインスタンスの状態を保存し，スナップショットとアンドゥを行う
- Composite, Decorator
  - 複雑な構造のインスタンスを動的に生成する時にPrototypeが使われる
- Command
  - 命令を複製する際に使われる
