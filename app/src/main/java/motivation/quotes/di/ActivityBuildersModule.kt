package motivation.quotes.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import motivation.quotes.di.auth.AuthFragmentBuildersModule
import motivation.quotes.di.auth.AuthModule
import motivation.quotes.di.auth.AuthScope
import motivation.quotes.di.auth.AuthViewModelModule
import motivation.quotes.ui.auth.AuthActivity

@Module
abstract class ActivityBuildersModule {

    @AuthScope
    @ContributesAndroidInjector(
        modules = [AuthModule::class, AuthFragmentBuildersModule::class, AuthViewModelModule::class]
    )
    abstract fun contributeAuthActivity(): AuthActivity
}