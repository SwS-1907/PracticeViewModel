package com.example.practiceviewmodel.VIewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.practiceviewmodel.Model.Person
import com.example.practiceviewmodel.Reposoterie.CalculateAgeRepo
import com.example.practiceviewmodel.Reposoterie.CalculateAgeRepoImpl

class CalcViewModel : ViewModel() {

    val repo : CalculateAgeRepo = CalculateAgeRepo()

    fun calcAge(name:String,age:String): MutableLiveData<Person> {
        var ld = repo.calculateAge(name,age)
        return  ld
    }
}