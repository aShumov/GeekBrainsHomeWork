package homeWork;

import homeWork.obstacleCourse.Course;
import homeWork.team.Team;
import homeWork.team.TeamMember;

public class Main {
    public static void main(String[] args) {

        Course c = new Course();// Создаем полосу препятствий
        Team team = new Team("Тигры"); // Создаем команду
        TeamMember ivan = new TeamMember("Иван",1); // Создаём участника
        TeamMember egor = new TeamMember("Егор",4);
        c.doIt(team); // Просим команду пройти полосу
        team.showResults(); // Показываем результаты

        ivan.jump(5); //Иван прыгаети
        ivan.run(2);
        egor.fight(3); //Егор спарингуется

    }
}
