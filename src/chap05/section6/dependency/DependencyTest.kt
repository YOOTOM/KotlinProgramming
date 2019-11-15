package chap05.section6.dependency

//의존 관계 나타내기
class Patient(val name: String, var id: Int) {
    fun doctorList(d: Doctor) {
        println("Patient: #name, Doctor: ${d.name}")
    }
}

class Doctor(val name: String, val p: Patient) {
    val customrId: Int = p.id

    fun patientList() {
        println("Doctor: #name, Patient: ${p.name}")
        println("Patient Id: $customrId")
    }
}

fun main() {
    val patient1 = Patient("Kildong",1234)
    val doc1 = Doctor("KimSabu", patient1) //Doctor클래스는 Patient클래스에 의존한다.
    doc1.patientList()
}