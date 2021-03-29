package com.ziroom.kotlindemo.chapter5.fanxing

/**
 *Author:关震
 *Date:2021/3/26 15:34
 *Description:xiebian 协变
 **/

interface Book

interface EduBook : Book

class BookStore<out T: Book> {
    fun getBook(): T {
        TODO()
    }
}

fun covariant() {
    val eduBookStore: BookStore<EduBook> = BookStore<EduBook>()
    val bookStore: BookStore<Book> = eduBookStore

    val book: Book = bookStore.getBook()
    val eduBook: EduBook = eduBookStore.getBook()
}


