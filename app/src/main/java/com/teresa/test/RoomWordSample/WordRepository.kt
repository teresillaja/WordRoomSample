package com.teresa.test.RoomWordSample

import android.arch.lifecycle.LiveData
import android.support.annotation.WorkerThread

class WordRepository(private val wordDao: WordDao) {

    val allWords: LiveData<List<Word>> = wordDao.getAll()

    @WorkerThread
    suspend fun insert(word: Word){
        wordDao.insert(word)
    }
}