import coil.setupLibraryModule

plugins {
    id("com.android.library")
    id("kotlin-android")
}

setupLibraryModule(publish = true, document = false)

dependencies {
    constraints {
        api(projects.coilBase)
        api(projects.coilSingleton)
        api(projects.coilGif)
        api(projects.coilSvg)
        api(projects.coilVideo)
    }
}
