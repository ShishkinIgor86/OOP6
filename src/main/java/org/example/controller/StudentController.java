package org.example.controller;

import java.util.ArrayList;
import java.util.List;
// Импорт класса.
import org.example.data.StudentGroup;
import org.example.data.User;
import org.example.view.UserView;
// Создаём типизированный StudentController, наследующегося от типа User.
public class StudentController<T extends User>
{
    // Установление полей для класса StudentController.
    /**
     * @param groups - Группы студентов.
     * @param userView - Отображение User.
     */
    private List<StudentGroup<T>> groups;
    private UserView<T> userView;
    // Создание конструктора, который принимает значение полей класса StudentController, внутри конструктора происходит инициализация полей для передачи значений объекта.
    public StudentController(UserView<T> userView)
    {
        groups = new ArrayList<>();
        this.userView = userView;

    }
    // Метод создания группы студентов.
    public void createGroup(String groupName)
    {
        StudentGroup<T> group = new StudentGroup<>(groupName);
        groups.add(group);

    }
    // Метод добавления студента в группу.
    public void addStudentToGroup(StudentGroup<T> group, T student)
    {
        group.addStudent(student);

    }
    // Метод удаления студента из группы.
    public void removeStudentFromGroup(StudentGroup<T> group, T student)
    {
        group.removeStudent(student);

    }
    // Метод возврата всех групп студентов.
    public List<StudentGroup<T>> getGroups()
    {
        return groups;

    }
    // Метод который отправляет группы в консоль.
    public void sendGroupsOnConsole()
    {
        userView.sendOnConsole(groups);

    }
}