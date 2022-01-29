# Proxy pattern

### 必要になってから作る

Lazy

SpringもProxyを使っている（DIコンテナ中のBeanはプロキシをかましてからDIされる）

## 関連しているパターン
- Adapter
  - Adapterは継承と委譲で異なるAPIを繋げる
  - Proxyは同じAPIを提供する
- Decorator
  - Decoratorの目的は新しい機能を提供すること
