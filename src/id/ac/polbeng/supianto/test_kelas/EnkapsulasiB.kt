package id.ac.polbeng.supianto.test_kelas

class Employee(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
        get() = field

    var name: String = _name
        get() {
            return field.uppercase()
        }
        set(value) {
            field = value
        }

    var age: Int = _age
        get() = field
        set(value) {
            field = if (value > 0) value else throw IllegalArgumentException("Age must be greater than zero")
        }
}

fun main() {
    val emp = Employee(1, "Budi", 25)
    println("ID: ${emp.id}, Name: ${emp.name}, Age: ${emp.age}")
}