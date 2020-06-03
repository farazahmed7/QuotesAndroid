package motivation.quotes.di.auth

import dagger.Module
import dagger.android.ContributesAndroidInjector
import motivation.quotes.ui.auth.LoginFragment

@Module
abstract class AuthFragmentBuildersModule {

    @ContributesAndroidInjector
    abstract fun contributeLoginFragment(): LoginFragment
}