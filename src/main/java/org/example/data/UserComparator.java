package org.example.data;

import java.util.Comparator;
// Создаём типизированный UserComparator, который реализует Comparator от типа User.
class UserComparator<T extends User> implements Comparator<T>
{
    // Объявление типизированных имен аргументов.
    @Override
    public int compare(T User1, T User2)
    {
        // Сравниваем Фамилию.
        int resultOfComparing = User1.getSecondName().compareTo(User2.getSecondName());
        // Если Фамилии одинаковые, делаем дополнительное сравнение по именам.
        if (resultOfComparing == 0)
        {
            // Сравниваем имя.
            resultOfComparing = User1.getFirstName().compareTo(User2.getFirstName());
            // // Если Имена одинаковые, делаем дополнительное сравнение по Отчеству.
            if (resultOfComparing == 0)
            {
                return User1.getPatronymic().compareTo(User2.getPatronymic());
            }

        }
        // Возвращаем результат.
        return resultOfComparing;

    }
}