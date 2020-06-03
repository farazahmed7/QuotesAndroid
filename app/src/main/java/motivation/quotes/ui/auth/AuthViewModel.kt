package motivation.quotes.ui.auth

import androidx.lifecycle.ViewModel
import motivation.quotes.repository.auth.AuthRepository
import javax.inject.Inject

class AuthViewModel
@Inject
constructor(
    val authRepository: AuthRepository
): ViewModel(){

}