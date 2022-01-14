# Decorator pattern

### 飾り枠と中身の同一視

1. Component役を用意する
    1. APIを提供する役割
2. それを継承してConcreteComponent役を用意する
3. Componentを継承してDecoratorを用意する
4. Decoratorをガチャガチャ組み合わせて欲しい機能を実現する

要するに十分に小さく作られたDecoratorが装飾だけをして、残りの処理を委譲していく

JavaのReaderの話が凄くしっくりくる

1. Readerは何かを読み込むAPIを提供するComponent役
2. FileReaderはFileから内容を読み込む実装
3. BufferedReaderやLineNumberReaderは装飾
4. 装飾を組み合わせて君だけのReaderを作ろう

```java
Reader reader = new LineNumberReader(
    new BufferedReader(
        new FileReader(fileObject)
    )
);
```

## 関連しているパターン
- Adapter
  - Decoratorは一つのAPIにしたがって実装と装飾を作る
  - Adapterは異なる2つのAPIを繋ぐ
- Strategy
  - Decoratorは装飾を変更する
  - Strategyはアルゴリズムを切り替える
- Composite
  - Decoratorは再帰構造を使って柔軟に機能を実現できるようにする
  - Compositeは再帰構造をトラバースすることを目的にする
