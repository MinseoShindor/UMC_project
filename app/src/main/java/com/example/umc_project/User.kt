package com.example.umc_project

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "UserTable")
data class User(
    @SerializedName(value = "email")val email: String,
    @SerializedName(value = "password")val password: String,
    @SerializedName(value = "name")val name: String,
    @SerializedName(value = "Group")val Group: String, //단체(관리자 only)
    @SerializedName(value = "region")val region: String //지역(봉사자 only)
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}
