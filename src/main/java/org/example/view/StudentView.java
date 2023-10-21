package org.example.view;

import java.util.List;
import java.util.logging.Logger;
// Импорт класса.
import org.example.data.Student;
import org.example.data.StudentGroup;
import org.example.data.User;
// Создаём типизированный StudentView, который реализует UserView от типа User.
public class StudentView implements UserView<User>
{
    // Установление полей для класса StudentView.
    /**
     * @param logger - id студента, вывод в консоль.
     */
    Logger logger = Logger.getLogger(StudentView.class.getName());
    // Вывод информации по конкретному студенту из группы студентов.
    @Override
    public void sendOnConsole(List<StudentGroup<User>> groups)
    {
        // В цикле проходим по каждой группе студентов.
        for(StudentGroup<User> group: groups)
        {
            // Проходим по каждому студенту в группе студентов.
            for(User student: group.getStudents())
            {
                // Выводим информацию о студенте.
                logger.info(student.toString());
            }
        }

    }
    // Вывод конкретной группы студентов.
    @Override
    public void sendOnConsoleUserGroup(StudentGroup<User> studentGroup)
    {
        logger.info(studentGroup.toString());

    }
    // Вывод списка студентов.
    @Override
    public void sendOnConsoleListStudent(List<Student> students)
    {
        logger.info(students.toString());

    }
}
