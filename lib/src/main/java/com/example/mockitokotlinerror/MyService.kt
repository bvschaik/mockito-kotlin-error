package com.example.mockitokotlinerror

class MyService(private val repository: MyRepository) {
    fun checkSomething(): Boolean {
        return repository.getData().isNotEmpty()
    }
}

class MyRepository {
    fun getData(): List<String> {
        return emptyList()
    }
}
