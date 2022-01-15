# Visitor pattern

### 構造を渡り歩きながら仕事をする

- 構造と処理を分けたい時に使える
- 乱暴に考えると
```kotlin
when {
    a is A -> actionForA(a)
    a is B -> actionForB(a)
}
```
をオーバーロードで表現した感じ？

## 関連しているパターン
- Iterator
  - Iteratorはデータ構造の要素を一つ一つ得るのに使える
  - Visitorは、各要素に特定の処理を施すのに使える
- Composite
  - ElementはCompositeに従う時がある
- Interpreter
  - 作成した構文木をVisitorで走査する
