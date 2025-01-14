package com.example.myapplication.toyproject.login.presenter.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.data.repository.UserDataRepository
import com.example.myapplication.toyproject.login.presenter.chatting.FriendListViewModel
import com.example.myapplication.toyproject.login.presenter.chatting.friend.AddListViewModel
import com.example.myapplication.toyproject.login.presenter.chatting.friend.UserProfileViewModel
import com.example.myapplication.toyproject.login.presenter.login.LoginViewModel
import com.example.myapplication.toyproject.login.presenter.login.signup.SignUpViewModel

class ViewModelFactory(private val repository: UserDataRepository) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(LoginViewModel::class.java) ->
                LoginViewModel(repository) as T
            modelClass.isAssignableFrom(FriendListViewModel::class.java) ->
                FriendListViewModel(repository) as T
            modelClass.isAssignableFrom(AddListViewModel::class.java) ->
                AddListViewModel(repository) as T
            modelClass.isAssignableFrom(SignUpViewModel::class.java) ->
                SignUpViewModel(repository) as T
            modelClass.isAssignableFrom(UserProfileViewModel::class.java) ->
                UserProfileViewModel(repository) as T
            else -> {
                throw IllegalArgumentException()
            }
        }
    }
}