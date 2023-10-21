package org.example.view;

import java.util.List;
// Импорт класса.
import org.example.data.User;
import org.example.data.StudentGroup;
import org.example.data.Student;
// Создаём типизированный UserView, наследующегося от типа User.
public interface UserView<T extends User>
{
    // Установление полей для класса UserView.

    void sendOnConsole(List<StudentGroup<T>> groups);
    void sendOnConsoleUserGroup(StudentGroup<T> studentGroup);
    void sendOnConsoleListStudent(List<Student> students);
}