package motivation.quotes
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import motivation.quotes.di.DaggerAppComponent

class BaseApplication: DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().application(this).build()
    }

}