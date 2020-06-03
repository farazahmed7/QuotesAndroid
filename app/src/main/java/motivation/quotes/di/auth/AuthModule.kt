package motivation.quotes.di.auth


import dagger.Module
import dagger.Provides
import motivation.quotes.api.auth.QuotesAuthService
import motivation.quotes.persistence.AccountPropertiesDao
import motivation.quotes.persistence.AuthTokenDao
import motivation.quotes.repository.auth.AuthRepository
import motivation.quotes.session.SessionManager
import retrofit2.Retrofit

@Module
class AuthModule{

    @AuthScope
    @Provides
    fun provideOpenApiAuthService(): QuotesAuthService {
        return Retrofit.Builder().baseUrl("https://www.google.com/")
            .build()
            .create(QuotesAuthService::class.java)
    }

    @AuthScope
    @Provides
    fun provideAuthRepository(
        sessionManager: SessionManager,
        authTokenDao: AuthTokenDao,
        accountPropertiesDao: AccountPropertiesDao,
        quotesAuthService: QuotesAuthService
    ): AuthRepository {
        return AuthRepository(
            authTokenDao,
            accountPropertiesDao,
            quotesAuthService,
            sessionManager
        )
    }

}