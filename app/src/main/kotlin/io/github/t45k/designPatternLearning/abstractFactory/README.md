# Abstract Factoryパターン

### 関連する部品を組み合わせて製品を作る
1. 抽象的な部品と，それを生成する抽象的な工場を定義する
2. それぞれを実装する
3. Mainから抽象的な工場を生成し，それに対するメソッド呼び出しで必要な部品を生成する
4. 部品をMainでガチャガチャする

## 関連しているパターン
- Builder
  - Abstract factoryはインターフェースが決まっている抽象的な部品を組み合わせて複雑な構造を持ったインスタンスを作る
  - Builderは，段階を追って大きなインスタンスを作る
- Factory Method
  - Abstract Factoryで製品や部品を作るときに，Factory Methodを作ることがあるらしい
- Composite
  - 作られる製品がCompositeになることがあるらしい
- Singleton
  - Concrete FactoryがSingletonになるらしい
