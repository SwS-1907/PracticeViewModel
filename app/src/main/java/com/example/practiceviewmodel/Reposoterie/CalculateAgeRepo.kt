package com.example.practiceviewmodel.Reposoterie

import androidx.lifecycle.MutableLiveData
import com.example.practiceviewmodel.Model.Person
import java.util.Calendar

class CalculateAgeRepo :CalculateAgeRepoImpl {

    override fun calculateAge(name: String, birth: String):MutableLiveData<Person> {

        var ld =  MutableLiveData<Person>()
        var currentY = Calendar.getInstance().get(Calendar.YEAR)
        var age =currentY - birth.toInt()

        ld.postValue(Person(name,age))

        return ld
    }
}