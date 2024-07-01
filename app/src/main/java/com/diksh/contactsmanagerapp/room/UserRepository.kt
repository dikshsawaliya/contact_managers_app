package com.diksh.contactsmanagerapp.room


//declared dao as private as only us need the access the database
class UserRepository(private val dao : UserDAO) {


    val users = dao.fetchAllUserInDb()

    suspend fun insert(user: User): Long{
        return dao.insertUser(user)
    }
}