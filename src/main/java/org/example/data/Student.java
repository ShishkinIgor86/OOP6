package org.example.data;

public class Student extends User
{
    // Установление полей для класса Student.
    /**
     * @param studentId - Уникальный индификатор студента.
     */
    private Long studentId;

    // Создание конструктора, который наследует значение полей класса User и передаёт поле класса Student, внутри конструктора происходит инициализация полей для передачи значений объекта.
    public Student(String firstName, String secondName, String patronymic, Long studentId)
    {
        super(firstName, secondName, patronymic);
        this.studentId = studentId;
    }
    // Определение Geters and Seters.
    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }
    // Создание консольной строки toString для вывода в консоль.
    @Override
    public String toString() {
        return "User [firstName=" + firstName + ", secondName=" + secondName + ", patronymic=" + patronymic + "studentId=" + studentId + "]";
    }
}