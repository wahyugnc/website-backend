package data.user.db

import data.news.model.request.UpdateNewsRequest
import data.user.model.UserItem
import data.user.model.request.InsertUserRequest
import data.user.model.request.ListUserRequest
import data.user.model.request.UpdateUserRequest
import io.reactivex.Flowable
import io.reactivex.Single

interface UserDatabase {

    fun listUser(listUserRequest: ListUserRequest): Flowable<List<UserItem>>

    fun getUser(id: Int): Single<UserItem>

    fun getUserByEmail(email: String): Single<Boolean>

    fun insertUser(insertUserRequest: InsertUserRequest): Single<Boolean>

    fun updateUser(updateUserRequest: UpdateUserRequest): Single<Boolean>

    fun deleteUser(id: Int): Single<Boolean>

}