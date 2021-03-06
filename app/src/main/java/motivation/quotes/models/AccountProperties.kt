package motivation.quotes.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Entity(
 tableName = "account_properties"
)
data class AccountProperties (

  @SerializedName("_id")
  @Expose
  @PrimaryKey(autoGenerate = false)
  @ColumnInfo(name="pk")
  var pk: Int,

  @SerializedName("email")
  @Expose
  @ColumnInfo(name="email")
  var email: String


)