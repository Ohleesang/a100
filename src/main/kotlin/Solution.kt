/** x-> y     으로 변환
 * x = x + n
 * x = 2 * x
 * x = 3 * x
 * 셋중 하나의 연산을 이용
 * x -> y 일때, 최소 연산횟수를 return (만들수 없다면 -1)
 *
 * 1~1,000,000 x<=y
 */


class Solution {

    fun calculate(x: Int, n: Int, type: Int): Int {
        when (type) {
            0 -> return x + n
            1 -> return 2 * x
            2 -> return 3 * x
        }
        return -1
    }

    fun solution(x: Int, y: Int, n: Int): Int {
        var answer: Int = 0
//        var array = IntArray(MAX_SIZE+1,{-1})//0~MAX_SIZE-1 ==> 1~MAX_SIZE
        var count = 0
        var temp = x
        while (temp != y) {
            temp = calculate(temp, n, 0)
            //temp = calculate(temp,n,1)
            //temp - calculate(temp,n,2)
            count++
        }
        answer = count

        return answer
    }

    companion object {
        const val MAX_SIZE = 1000000
    }
}

fun main() {
    val a = Solution()
    a.solution(10, 40, 5)//2
    a.solution(10, 40, 30)//1
    a.solution(2, 5, 4)//-1
}