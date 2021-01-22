package com.ziroom.kotlindemo.chapter5.zhujie

//声明注解

@Target(
    AnnotationTarget.CLASS,
    AnnotationTarget.FUNCTION,
    AnnotationTarget.VALUE_PARAMETER
)
@Retention(AnnotationRetention.RUNTIME)
@Repeatable
@MustBeDocumented
annotation class TestCase(val id: String)

@Target(
    AnnotationTarget.CLASS,
    AnnotationTarget.FUNCTION,
    AnnotationTarget.VALUE_PARAMETER
)
@Retention(AnnotationRetention.RUNTIME)
@Repeatable
@MustBeDocumented
annotation class Run

//使用注解
@Run
class SwordTest {
    @TestCase(id = "10")
    fun testCase(testId: String) {
        println("Run SwordTest ID = ${testId}")
    }
}

//处理注解
fun testAnnoProcessing() {
    val sword = SwordTest()
    val kClass = sword::class  //sword 对象实例类KClass类的引用
    val declaredFunctions = kClass.members
    for (f in declaredFunctions) {
        f.annotations.forEach {
            if(it is TestCase) {
                val id = it.id
                println(id) //doSomeThing
                f.call(sword, id) //方法调用
            }
        }
    }
}

fun main(args: Array<String>) {
    testAnnoProcessing()
}

