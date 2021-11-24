# Template Methodパターン

## 具体的な処理をサブクラスにまかせる

親（抽象）クラスで大まかな処理を書く． 細かいことは抽象メソッドにしておく．

継承したクラスで抽象メソッドを実装する．

## 関連しているパターン

- Factory Method
    - インスタンス生成にTemplate Methodを応用する
- Strategy
    - Template Methodは継承を利用して振る舞いを変える
    - Strategyでは移譲を利用して振る舞いを変える
