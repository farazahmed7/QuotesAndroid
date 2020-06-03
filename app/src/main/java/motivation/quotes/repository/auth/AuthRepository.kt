package motivation.quotes.repository.auth

import motivation.quotes.api.auth.QuotesAuthService
import motivation.quotes.persistence.AccountPropertiesDao
import motivation.quotes.persistence.AuthTokenDao
import motivation.quotes.session.
import javax.inject.Inject

class AuthRepository
@Inject
constructor(
    val authTokenDao: AuthTokenDao,
    val accountPropertiesDao: AccountPropertiesDao,
    val quotesAuthService: QuotesAuthService,
    val :
){
}