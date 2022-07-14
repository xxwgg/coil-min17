![Coil](logo.svg)

An image loading library for Android backed by Kotlin Coroutines. Coil is:

- **Fast**: Coil performs a number of optimizations including memory and disk caching, downsampling the image in memory, automatically pausing/cancelling requests, and more.
- **Lightweight**: Coil adds ~2000 methods to your APK (for apps that already use OkHttp and Coroutines), which is comparable to Picasso and significantly less than Glide and Fresco.
- **Easy to use**: Coil's API leverages Kotlin's language features for simplicity and minimal boilerplate.
- **Modern**: Coil is Kotlin-first and uses modern libraries including Coroutines, OkHttp, Okio, and AndroidX Lifecycles.

Coil is an acronym for: **Co**routine **I**mage **L**oader.

Made with ❤️ at [Instacart](https://www.instacart.com). Translations: [한국어](README-ko.md), [中文](README-zh.md), [Türkçe](README-tr.md)

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
