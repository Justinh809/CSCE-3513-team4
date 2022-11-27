# CSCE-3513-team4
University of Arkansas CSCE 3513 Team 4. Laser tag software!!

Overview: 
    This project is a demonstration of laser tag software. It uses a simulated data traffic that would normally
    come from the laser tag equipment. It will only run two players on each team, but can easily be modified to 
    run with actual equipment with up to 15 players per team. 

    The traffic generator needs to be started before the game starts. It is best to run the traffic generator 
    before you even run the laser tag program, as shown in the "To Run Software" section. 

Prerequisites: 
    Java 8 or higher. (make sure your path is set properly)
    updated python (3.11 works)
    download zip file from github and extract to the folder of your choice

To Run Software:

    Mac: Run: Bash Traffic.bash
         then run: Bash LaserTag.bash

    Windows: Run: Traffic.bat
             then run: LaserTag.bat

Player Entry:

    Entry fields for Player ID only accepts integers. Hit enter to confirm any text in the ID or CodeName fields.

    If entered ID does not correspond to a Player name, enter one in the name field.
    Entered name will be paired with that ID in the Player database.

    Hit "=" or click start game to advance to the Game Action screen, focus must be set to the frame so you cannot 
    be clicked into a text box for it to work. Hit enter to refocus the frame.

