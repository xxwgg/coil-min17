![Coil](logo.svg)

Coil 是一个 Android 图片加载库，通过 Kotlin 协程的方式加载图片。特点如下：

- **更快**: Coil 在性能上有很多优化，包括内存缓存和磁盘缓存，把缩略图存保存在内存中，循环利用 bitmap，自动暂停和取消图片网络请求等。
- **更轻量级**: Coil 只有2000个方法（前提是你的 APP 里面集成了 OkHttp 和 Coroutines），Coil 和 Picasso 的方法数差不多，相比 Glide 和 Fresco 要轻量很多。
- **更容易使用**: Coil 的 API 充分利用了 Kotlin 语言的新特性，简化和减少了很多样板代码。
- **更流行**: Coil 首选 Kotlin 语言开发并且使用包含 Coroutines, OkHttp, Okio 和 AndroidX Lifecycles 在内最流行的开源库。

Coil 名字的由来：取 **Co**routine **I**mage **L**oader 首字母得来。

在 [Instacart](https://www.instacart.com) 用❤️打造。
## Changed

```
Change minSdk=17 from 21
Not Supported compose
```

## Download

Just available on `mavenLocal()`.

## Step

1.clone this

2.build :
```shell
./gradlew publishToMavenLocal --no-daemon --no-parallel
```
3.add mavenLocal() to your project

4.add dependencies
```kotlin
implementation("com.github.xxwgg:coil:2.1.0-min17-SNAPSHOT")
implementation("com.github.xxwgg:coil-gif:2.1.0-min17-SNAPSHOT")
//...
```
