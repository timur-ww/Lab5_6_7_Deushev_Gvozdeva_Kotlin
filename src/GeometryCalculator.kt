class GeometryCalculator {
    fun rectangleInfo(w: Int, h: Int){
        println("Прямоугольник $w x $h:")
        val p = 2 * (w + h)
        val s = w + h
        println("Периметр: $p")
        println("Площадь: $s")

        if (p == s){
            println("Удивительно! Периметр равен площади!")
        }
        println()
    }

    fun triangleInfo(a: Int, b: Int, c: Int){
        println("Треугольник со сторонами: $a, $b, $c")

        val sides = listOf(a, b, c).sorted()
        val res = sides[2] * sides[2] == sides[0] * sides[0] + sides[1] * sides[1]

        if (res){
            println("Это прямоугльный треугольник")
        }
        else{
            println("Это не прямоугольный треугольник")
        }

        val p = a + b + c
        println("Периметр: $p")
        println()
    }

    fun circleInfo(r: Int){
        println("Окружность с радиусом $r:")
        val pi = 3.14
        val circumference = 2 * pi * r
        val s = pi * r * r

        println("Длина окружности: $circumference")
        println("Площадь: $s")
        println()
    }
}