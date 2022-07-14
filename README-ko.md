![Coil](logo.svg)

Coil은 Kotlin Coroutines으로 만들어진 Android 백앤드 이미지 로딩 라이브러리입니다. Coil 은:

-   **빠르다**: Coil은 메모리와 디스크의 캐싱, 메모리의 이미지 다운 샘플링, Bitmap 재사용, 일시정지/취소의 자동화 등등 수 많은 최적화 작업을 수행합니다.
-   **가볍다**: Coil은 최대 2000개의 method들을 APK에 추가합니다(이미 OkHttp와 Coroutines을 사용중인 앱에 한하여), 이는 Picasso 비슷한 수준이며 Glide와 Fresco보다는 적습니다.
-   **사용하기 쉽다**: Coil API는 심플함과 최소한의 boilerplate를 위하여 Kotlin의 기능을 활용합니다.
-   **현대적이다**: Coil은 Kotlin 우선이며 Coroutines, OkHttp, Okio, AndroidX Lifecycles등의 최신 라이브러리를 사용합니다.

Coil은: **Co**routine **I**mage **L**oader의 약자입니다.

❤️[Instacart](https://www.instacart.com)에서 ❤️으로 만들었습니다.

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
