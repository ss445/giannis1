package execution

object Referee {

  def playGame(team1: Team, team2: Team): Unit = {
    var positive = 0
    var positive2 = 0
    team1.score = team1.Offense - team2.Defense
    team2.score = team2.Offense - team1.Defense
    if (team1.score > 0 && team2.score > 0){
       positive = team1.score
       positive2 = team2.score
    }
    else{
       positive = 0
       positive2 = 0
    }
  }

  //def declareWinner(team1: Team, team2: Team): Team = {
    //val his = team1.score
    //val hers = team2.score
    //if (his > hers){
     // his
    //}
    //else if(hers > his){
     // hers
   // }
   // else{
     // var jim: Team = new Team(0, 0)
    //}
  //}


}
