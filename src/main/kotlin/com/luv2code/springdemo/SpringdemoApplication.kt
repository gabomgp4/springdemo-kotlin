package com.luv2code.springdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.support.ClassPathXmlApplicationContext

@SpringBootApplication
class SpringdemoApplication

fun main(args: Array<String>) {
    val context = ClassPathXmlApplicationContext("applicationContext.xml")
    val coach = context.getBean("myCoach", Coach::class.java)
    println(coach.getDailyWorkout())
    context.close()
//    runApplication<SpringdemoApplication>(*args)
}
