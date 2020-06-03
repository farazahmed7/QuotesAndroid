package motivation.quotes.di


import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import motivation.quotes.viewmodels.ViewModelProviderFactory

@Module
abstract class ViewModelFactoryModule {

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelProviderFactory): ViewModelProvider.Factory
}