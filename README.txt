PROJECT 4. This project was made with the collaboration of 3 CSC171 students:
Names:  Darman Khan  (Net ID: dkhan2), Sufian Mushtaq (Net ID: smushtaq), Bahawar Dhillon(Net ID: bdhillon)
	   
User's guide: Press SPACE to start the game. The player controls a paddle with the LEFT and RIGHT arrow keys to prevent a ball from falling to the bottom 
of the screen. Player scores a point every time the paddle intercepts the ball. The highest score in the game is saved.

This project builds a game "Lob Pong" where the goal is to prevent a ball, which follows the trajectory of a projectile, from falling to the bottom. 
The project is made using three classes: GameCanvas, MyApp and Highscore. The main graphics of the game are drawn in the GameCanvas class, the MyApp 
class constructs the JFrame and the Highscore class is used to store the highscore by two methods 'read' and 'write'.

The player starts the game with 3 lives and loses one life each time the ball hits the bottom. The player's lives, score, level,  highscore and time 
remaining for the level are displayed at the top of the screen using the drawString method and are altered accordingly. The time is displayed using
the fillArc method which reduces the angle in proportion with the time remaining in the level. As the player progresses through the levels the speed
 of the ball increases and the size of the paddle decreases. The location of the ball along its trajectory is calculated using the equations provided
for velocity and position. Using the TimerCallback method the position of the ball is calculated every 5ms and the canvas is repainted. The time used 
for calculating x and y positions is incremented by 0.04 and 0.025 second respectively. KeyListener is implemented in order to move the paddle 
horizontally as the keyPressed method increases/decreases the x position of the paddle by 20 depending on whether the right or left arrow key is pressed. 
In the actionPerformed method a new method 'collide' is called within which the conditions for the ball's positions are nested in order to make it 
reflect off the walls and the paddle. The methods updateLives, updateScoreLabel, updateTimer, updateLevelLabel, updateHighscoreLabel are used to 
update the display at the top. If the player runs out of lives the 'endgame' method is called which resets everything to its initial value and checks 
if the current score is higher than the highscore in which case it replaces the highscore with the current score.

Extra Credit:
1) The highscore is stored in a file and is read and compared every time the code runs. If the score in the file is lower than the score of the 
current game, the new high score is written in the file.
2) A method sound() is added which plays a 'boing' sound every time ball comes into contact with the walls or the paddle.
