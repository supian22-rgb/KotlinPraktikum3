package id.ac.polbeng.supianto.test_kelas

fun main() {
    val meri = Student("Meri", 20)
    // Destructuring Declaration
    val(name, age) = meri
    println("Name = $name")
    println("Age = $age")
}