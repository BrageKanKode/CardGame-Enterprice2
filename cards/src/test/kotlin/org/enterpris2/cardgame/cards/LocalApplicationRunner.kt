import org.enterpris2.cardgame.cards.Application
import org.springframework.boot.SpringApplication


fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, "--spring.profiles.active=test")
}