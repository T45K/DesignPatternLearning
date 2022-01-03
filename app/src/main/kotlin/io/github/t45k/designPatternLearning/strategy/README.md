# Strategyパターン

### アルゴリズムをごっそり切り替える

処理をインターフェースに切って、必要に応じて実装を入れ替える。
キモは
- 処理は全て委譲する
- 委譲するオブジェクトを切り替え可能にする

## 関連しているパターン
- Flyweight
  - ConcreteStrategyはFlyweightパターンを使って共有可能
- Abstract Factory
  - Strategyでは、アルゴリズムを切り替える
  - Abstract Factoryでは、具体的な工場、部品、製品を切り替える
- State
  - Stateでは状態をクラスで表現する
