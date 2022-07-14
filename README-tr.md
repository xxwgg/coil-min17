![Coil](logo.svg)

Android için Kotlin Coroutines tarafından desteklenen bir görüntü yükleme kütüphanesi. Coil:

- **Hızlıdır**: Coil bellek ve disk önbellekleme, bellekteki görüntüyü alt-örnekleme, biteşlemlerin tekrar kullanımı, isteklerin otomatik olarak durdurulması/iptali ve daha fazlasını içeren pek çok sayıda optimizasyon gerçekleştirir.
- **Hafiftir**: Coil, APK'nıza Picasso ile benzer ve Glide ve Fresco'dan önemli ölçüde daha az sayıda, 2000 civarında metod ekler.(Halihazırda OkHttp ve Coroutines kullanan uygulamalar için)
- **Kullanımı kolaydır**: Coil'in API'si basitlik ve mininum basmakalıp için Kotlin'in dil özelliklerini sonuna kadar kullanır.
- **Moderndir**: Coil Kotlin-önceliklidir ve Coroutines, OkHttp, Okio ve AndroidX Lifecycles gibi modern kütüphaneleri kullanır.


Coil şunların baş harflerinden oluşur: **Co**routine **I**mage **L**oader.

[Instacart](https://www.instacart.com)'da ❤️ ile yapıldı. Çeviriler: [Korece](README-ko.md), [Çince](README-zh.md)
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
