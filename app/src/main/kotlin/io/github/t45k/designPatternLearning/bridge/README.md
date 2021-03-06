# Bridge パターン

### 機能の階層と実装の階層を分ける

- 継承は2通りの使い方がある
  - 機能追加の継承
    - たまに見かける実装
    - クラスAに機能を追加したい時、クラスAに直接そのAPIを書くのではなく、クラスAを継承したクラスに書く
    - いわゆる差分プログラミング
    - 親クラスのメソッドを使いたいだけとも言える？
  - 実装追加の継承
    - よくやる継承
    - インターフェースや抽象クラスを継承して、新しい実装を追加する
- これらがごっちゃになると辛くなる
- 役割を分ける
  - Abstraction
    - 「機能」を提供する最上位のクラス
    - 「実装」を提供するクラスに処理を委譲する
  - RefinedAbstraction
    - 機能を追加するためのクラス
    - Abstractionのメソッドを使いまわす
  - Implementor
    - 「実装」を提供する抽象クラス
    - APIを提供するのみに留める
  - ConcreteImplementor
    - 実装クラス

### 継承は固い結びつき、委譲はゆるやかな結びつき
- 継承関係は静的に決定してしまう
- 委譲は動的に決定できる
  - DI

### 関連しているパターン
- Template Method
  - Template Methodでは実装のクラス階層を利用している
- Abstract Factory
  - ConcreteImplementorを構築するためにAbstractFactoryが使われたりする
- Adapter
  - Adapterでは、機能は煮ているがAPIが異なるクラス同士を結びつける
