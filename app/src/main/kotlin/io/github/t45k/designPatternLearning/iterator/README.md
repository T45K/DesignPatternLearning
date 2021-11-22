# Iteratorパターン

順番に処理する

## 関連するパターン
- Visitorパターン
  - Iteratorパターンは集合体の要素を1つずつ処理していく
  - Iteratorの仕事は要素を一個ずつ持ってくるだけ
  - 処理する内容はIterator周りには書かない
  - Visitorは処理内容まで書ける

- Compositeパターン
  - 再帰的な構造

- Factory Methodパターン
  - iteratorメソッドがIteratorのインスタンスを作成するときにFactory Methodパターンが使われる場合があるらしい
