fun main() {
    val matrix = arrayOf(
        intArrayOf(5, 9, 6, 7, 2),
        intArrayOf(9, 8, 4, 5, 3),
        intArrayOf(6, 4, 3, 8, 7),
        intArrayOf(7, 5, 8, 4, 8),
        intArrayOf(2, 3, 7, 8, 1)
    )

    var isSymmetric = true
    for (i in matrix.indices) {
        for (j in i + 1 until matrix.size) {
            if (matrix[i][j] != matrix[j][i]) {
                isSymmetric = false
                break
            }
        }
        if (!isSymmetric) {
            break
        }
    }

    if (isSymmetric) {
        println("Массив является симметричным относительно главной диагонали")
    } else {
        println("Массив не является симметричным относительно главной диагонали")
    }
}
