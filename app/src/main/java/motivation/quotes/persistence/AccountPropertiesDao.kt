package motivation.quotes.persistence

import android.accounts.Account
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import motivation.quotes.models.AccountProperties

@Dao
interface AccountPropertiesDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAndReplace(accountProperties: AccountProperties):Long

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertORIgnore(accountProperties: AccountProperties):Long

    @Query("SELECT * from account_properties WHERE pk= :pk")
    fun searchByPk(pk: Int): AccountProperties?

    @Query("SELECT * from account_properties WHERE email= :email")
    fun searchByEmail(email: String): AccountProperties?
}