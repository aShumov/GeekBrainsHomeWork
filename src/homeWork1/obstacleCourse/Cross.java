package homeWork1.obstacleCourse;


import homeWork1.team.TeamMember;

public class Cross extends Obstacle {
    public Cross(int difficulty) {
        super(difficulty);
    }

    @Override
    public void goChallenge(TeamMember member) {
        member.run(super.getDifficulty());
    }

}
