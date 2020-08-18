import Color.*

fun mixOptimized(c1: Color, c2: Color) =
    when {
        (c2 == RED && c2 == YELLOW) || (c1 == YELLOW && c2 == RED) -> ORANGE
        (c2 == YELLOW && c2 == BLUE) || (c1 == BLUE && c2 == YELLOW) -> ORANGE
        (c2 == BLUE && c2 == VIOLET) || (c1 == VIOLET && c2 == BLUE) -> ORANGE
        else -> throw Exception("Dirty color")
    }