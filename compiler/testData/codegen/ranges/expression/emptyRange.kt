// Auto-generated by org.jetbrains.jet.generators.tests.GenerateRangesCodegenTestData. DO NOT EDIT!
import java.util.ArrayList

fun box(): String {
    val list1 = ArrayList<Int>()
    val range1 = 10..5
    for (i in range1) {
        list1.add(i)
    }
    if (list1 != listOf<Int>()) {
        return "Wrong elements for 10..5: $list1"
    }

    val list2 = ArrayList<Byte>()
    val range2 = 10.toByte()..-5.toByte()
    for (i in range2) {
        list2.add(i)
    }
    if (list2 != listOf<Byte>()) {
        return "Wrong elements for 10.toByte()..-5.toByte(): $list2"
    }

    val list3 = ArrayList<Short>()
    val range3 = 10.toShort()..-5.toShort()
    for (i in range3) {
        list3.add(i)
    }
    if (list3 != listOf<Short>()) {
        return "Wrong elements for 10.toShort()..-5.toShort(): $list3"
    }

    val list4 = ArrayList<Long>()
    val range4 = 10.toLong()..-5.toLong()
    for (i in range4) {
        list4.add(i)
    }
    if (list4 != listOf<Long>()) {
        return "Wrong elements for 10.toLong()..-5.toLong(): $list4"
    }

    val list5 = ArrayList<Char>()
    val range5 = 'z'..'a'
    for (i in range5) {
        list5.add(i)
    }
    if (list5 != listOf<Char>()) {
        return "Wrong elements for 'z'..'a': $list5"
    }

    val list6 = ArrayList<Double>()
    val range6 = 5.0..-1.0
    for (i in range6) {
        list6.add(i)
    }
    if (list6 != listOf<Double>()) {
        return "Wrong elements for 5.0..-1.0: $list6"
    }

    val list7 = ArrayList<Float>()
    val range7 = 5.0.toFloat()..-1.0.toFloat()
    for (i in range7) {
        list7.add(i)
    }
    if (list7 != listOf<Float>()) {
        return "Wrong elements for 5.0.toFloat()..-1.0.toFloat(): $list7"
    }

    return "OK"
}
