package com.example.practiceviewmodel.Reposoterie

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.practiceviewmodel.Model.Person

interface CalculateAgeRepoImpl {
    fun calculateAge(name:String, birth:String): MutableLiveData<Person>
}