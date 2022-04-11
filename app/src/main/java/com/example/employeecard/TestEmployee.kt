package com.example.employeecard

class TestEmployee() {
    val photo: Int = R.drawable.employee_photo
    val fullName: String = "Шаримова Наталья Александрова"
    val worksStatus: String = "Работает"
    val workExperience: String = "1 год 5 месяцeв"
    val position: String = "Инженер-программист (2 категории, моб.)"

    val description: String = "Разработка/Розница, Presto и Салон красоты/Мобильные Розница, " +
            "Presto и Склад/Мобильная розница и Presto/Розинца Android"

    val  achievements : List<Achievement> = listOf(
        Achievement("Работник года", R.drawable.achievement_image),
        Achievement("Работник года", R.drawable.achievement_image),
        Achievement("Работник года", R.drawable.achievement_image),
        Achievement("Работник года", R.drawable.achievement_image),
        Achievement("Работник года", R.drawable.achievement_image)
    )
    val phoneNumber: String = "+79044688667"
    val email: String = "natalia@tensor.ru"
}
