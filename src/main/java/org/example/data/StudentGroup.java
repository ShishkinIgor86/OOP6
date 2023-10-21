package org.example.data;

import java.util.ArrayList;
import java.util.List;
//Создание типизированого класса StudetnGroup, наследующегося от типа User.
public class StudentGroup<T extends User>
{
    // Установление полей для класса StudentGroup.
    /**
     * @param groupName -  Имя группы
     * @param students - Лист студентов
     */
    private String groupName;
    private List<T> students;

    // Создание конструктора, который принимает значение полей класса StudentGroup, внутри конструктора происходит инициализация полей для передачи значений объекта.
    public StudentGroup(String groupName)
    {
        this.groupName = groupName;
        this.students = new ArrayList<>();

    }

    // Определение Geters and Seters.
    public String getGroupName()
    {
        return groupName;
    }

    public void setGroupName(String groupName)
    {
        this.groupName = groupName;
    }

    public List<T> getStudents()
    {
        return students;

    }

    public void setStudents(List<T> students)
    {
        this.students = students;

    }
    // Метод для добавления студента.
    public void addStudent(T student)
    {
        students.add(student);

    }
    // Метод для удаления студента.
    public void removeStudent(T student)
    {
        students.remove(student);

    }
}