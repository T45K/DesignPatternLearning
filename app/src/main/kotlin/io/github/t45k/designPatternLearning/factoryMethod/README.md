# Factory Methodパターン

### インスタンス作成をサブクラスにまかせる

Template Methodをインスタンス作成に応用するだけ

## 関連するパターン

- Template Method
- Singleton
    - Creator役はシングルトンになることが多い
- Composite
    - ProductにCompositeパターンを当てはめることがあるらしい
- Iterator
    - `iterator`メソッドが`Iterator`を作成するときにFactory Methodが使われることがある
