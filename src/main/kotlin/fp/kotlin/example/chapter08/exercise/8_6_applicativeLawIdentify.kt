package fp.kotlin.example.chapter08.exercise

/**
 *
 * 연습문제 8-6
 *
 * 연습문제 8-3 에서 만든 리스트 애플리케이티브 펑터가 항등 법칙을 만족하는지 확인해보자.
 *
 */

fun main(args: Array<String>) {

    require(TODO() ==
        ACons(1, ACons(2, ANil)))
    
}

fun identity() = { x: Int -> x }