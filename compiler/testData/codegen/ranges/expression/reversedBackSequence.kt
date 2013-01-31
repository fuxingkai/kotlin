// Auto-generated by org.jetbrains.jet.generators.tests.GenerateRangesCodegenTestData. DO NOT EDIT!
import java.util.ArrayList

fun box(): String {
    val list1 = ArrayList<Int>()
    val range1 = (5 downTo 3).reversed()
    for (i in range1) {
        list1.add(i)
    }
    if (list1 != listOf<Int>(3, 4, 5)) {
        return "Wrong elements for (5 downTo 3).reversed(): $list1"
    }

    val list2 = ArrayList<Byte>()
    val range2 = (5.toByte() downTo 3.toByte()).reversed()
    for (i in range2) {
        list2.add(i)
    }
    if (list2 != listOf<Byte>(3, 4, 5)) {
        return "Wrong elements for (5.toByte() downTo 3.toByte()).reversed(): $list2"
    }

    val list3 = ArrayList<Short>()
    val range3 = (5.toShort() downTo 3.toShort()).reversed()
    for (i in range3) {
        list3.add(i)
    }
    if (list3 != listOf<Short>(3, 4, 5)) {
        return "Wrong elements for (5.toShort() downTo 3.toShort()).reversed(): $list3"
    }

    val list4 = ArrayList<Long>()
    val range4 = (5.toLong() downTo 3.toLong()).reversed()
    for (i in range4) {
        list4.add(i)
    }
    if (list4 != listOf<Long>(3, 4, 5)) {
        return "Wrong elements for (5.toLong() downTo 3.toLong()).reversed(): $list4"
    }

    val list5 = ArrayList<Char>()
    val range5 = ('c' downTo 'a').reversed()
    for (i in range5) {
        list5.add(i)
    }
    if (list5 != listOf<Char>('a', 'b', 'c')) {
        return "Wrong elements for ('c' downTo 'a').reversed(): $list5"
    }

    val list6 = ArrayList<Double>()
    val range6 = (5.0 downTo 3.0).reversed()
    for (i in range6) {
        list6.add(i)
    }
    if (list6 != listOf<Double>(3.0, 4.0, 5.0)) {
        return "Wrong elements for (5.0 downTo 3.0).reversed(): $list6"
    }

    val list7 = ArrayList<Float>()
    val range7 = (5.0.toFloat() downTo 3.0.toFloat()).reversed()
    for (i in range7) {
        list7.add(i)
    }
    if (list7 != listOf<Float>(3.0, 4.0, 5.0)) {
        return "Wrong elements for (5.0.toFloat() downTo 3.0.toFloat()).reversed(): $list7"
    }

    return "OK"
}
