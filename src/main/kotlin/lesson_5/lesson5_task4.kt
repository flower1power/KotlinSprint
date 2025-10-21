package org.example.lesson_5

const val USER_NAME = "Zaphod"
const val USER_PASSWORD = "PanGalactic"
fun main() {
    val greetingMsgMarvin = """
        Внимание, пассажир.
        Моя обязанность, как обычно, незавидная, - приветствовать вас на борту корабля "Heart of Gold".
        [вздыхает...] Что ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа.
        Я всегда готов служить, хотя это не приносит мне радости... но вы, наверное, об этом не заботитесь.
        [вздыхает ещё глубже...] Да, вперед, пожалуйста, вводите свои данные...
        """.trimIndent()

    val askLoginMsg = "\nВведите логин: "
    val wrongUserMsg = "Пользователь не существует, прошу зарегистрироваться."

    val askPasswordMsg = "Введите пароль: "

    val successMsgMarvin = """
        
        [вздыхает...] Ваши данные проверены, и о, чудо, они верны... 
        Пользователь $USER_NAME, вам разрешено входить на борт корабля "Heart of Gold". Хотя мне всё равно... 
        Ну вперед, войдите... 
        Если вам так уж надо, в конце концов... 
        [меланхолический вздох...] Надеюсь, вам понравится пребывание здесь больше, чем мне.
        """.trimIndent()


    println(greetingMsgMarvin)

    print(askLoginMsg)
    val login = readln()
    if (login != USER_NAME) {
        println(wrongUserMsg)
        return
    }

    print(askPasswordMsg)
    val password = readln()
    if (password == USER_PASSWORD) {
        println(successMsgMarvin)
    }
}